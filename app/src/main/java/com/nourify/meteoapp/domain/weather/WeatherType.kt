package com.nourify.meteoapp.domain.weather

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.nourify.meteoapp.R

sealed class WeatherType(
    @StringRes val weatherDesc: Int,
    @DrawableRes val iconRes: Int
) {
    object ClearSky : WeatherType(
        weatherDesc = R.string.clear_sky,
        iconRes = R.drawable.ic_sunny
    )
    object MainlyClear : WeatherType(
        weatherDesc = R.string.mainly_clear,
        iconRes = R.drawable.ic_cloudy
    )
    object PartlyCloudy : WeatherType(
        weatherDesc = R.string.partly_cloudy,
        iconRes = R.drawable.ic_cloudy
    )
    object Overcast : WeatherType(
        weatherDesc = R.string.overcast,
        iconRes = R.drawable.ic_cloudy
    )
    object Foggy : WeatherType(
        weatherDesc = R.string.foggy,
        iconRes = R.drawable.ic_very_cloudy
    )
    object DepositingRimeFog : WeatherType(
        weatherDesc = R.string.depositing_rime_fog,
        iconRes = R.drawable.ic_very_cloudy
    )
    object LightDrizzle : WeatherType(
        weatherDesc = R.string.light_drizzle,
        iconRes = R.drawable.ic_rainshower
    )
    object ModerateDrizzle : WeatherType(
        weatherDesc = R.string.moderate_drizzle,
        iconRes = R.drawable.ic_rainshower
    )
    object DenseDrizzle : WeatherType(
        weatherDesc = R.string.dense_drizzle,
        iconRes = R.drawable.ic_rainshower
    )
    object SlightFreezingDrizzle : WeatherType(
        weatherDesc = R.string.slight_freezing_drizzle,
        iconRes = R.drawable.ic_snowyrainy
    )
    object DenseFreezingDrizzle : WeatherType(
        weatherDesc = R.string.dense_freezing_drizzle,
        iconRes = R.drawable.ic_snowyrainy
    )
    object SlightRain : WeatherType(
        weatherDesc = R.string.slight_rain,
        iconRes = R.drawable.ic_rainy
    )
    object ModerateRain : WeatherType(
        weatherDesc = R.string.Rainy,
        iconRes = R.drawable.ic_rainy
    )
    object HeavyRain : WeatherType(
        weatherDesc = R.string.heavy_rain,
        iconRes = R.drawable.ic_rainy
    )
    object HeavyFreezingRain: WeatherType(
        weatherDesc = R.string.heavy_freezing_rain,
        iconRes = R.drawable.ic_snowyrainy
    )
    object SlightSnowFall: WeatherType(
        weatherDesc = R.string.slight_snow_fall,
        iconRes = R.drawable.ic_snowy
    )
    object ModerateSnowFall: WeatherType(
        weatherDesc = R.string.moderate_snow_fall,
        iconRes = R.drawable.ic_heavysnow
    )
    object HeavySnowFall: WeatherType(
        weatherDesc = R.string.heavy_snow_fall,
        iconRes = R.drawable.ic_heavysnow
    )
    object SnowGrains: WeatherType(
        weatherDesc = R.string.snow_grains,
        iconRes = R.drawable.ic_heavysnow
    )
    object SlightRainShowers: WeatherType(
        weatherDesc = R.string.slight_rain_showers,
        iconRes = R.drawable.ic_rainshower
    )
    object ModerateRainShowers: WeatherType(
        weatherDesc = R.string.moderate_rain_showers,
        iconRes = R.drawable.ic_rainshower
    )
    object ViolentRainShowers: WeatherType(
        weatherDesc = R.string.violent_rain_showers,
        iconRes = R.drawable.ic_rainshower
    )
    object SlightSnowShowers: WeatherType(
        weatherDesc = R.string.slight_rain_showers,
        iconRes = R.drawable.ic_snowy
    )
    object HeavySnowShowers: WeatherType(
        weatherDesc = R.string.heavy_snow_showers,
        iconRes = R.drawable.ic_snowy
    )
    object ModerateThunderstorm: WeatherType(
        weatherDesc = R.string.moderate_thunderstorm,
        iconRes = R.drawable.ic_thunder
    )
    object SlightHailThunderstorm: WeatherType(
        weatherDesc = R.string.thunderstorm_with_slight_hail,
        iconRes = R.drawable.ic_rainythunder
    )
    object HeavyHailThunderstorm: WeatherType(
        weatherDesc = R.string.thunderstorm_with_heavy_hail,
        iconRes = R.drawable.ic_rainythunder
    )

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when(code) {
                0  -> ClearSky
                1  -> MainlyClear
                2  -> PartlyCloudy
                3  -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> SlightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> SlightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderstorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}