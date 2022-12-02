package com.nourify.meteoapp.data.remote

import com.squareup.moshi.Json

data class WeatherDataDto(
    val time: List<String>,
    @field:Json(name = WeatherQueries.temperature)
    val temperatures: List<Double>,
    @field:Json(name = WeatherQueries.weatherCode)
    val weatherCodes: List<Int>,
    @field:Json(name = WeatherQueries.pressure)
    val pressures: List<Double>,
    @field:Json(name = WeatherQueries.windSpeed)
    val windSpeeds: List<Double>,
    @field:Json(name = WeatherQueries.humidity)
    val humidities: List<Double>
)

object WeatherQueries{
    const val temperature = "temperature_2m"
    const val weatherCode = "weathercode"
    const val pressure    = "pressure_msl"
    const val windSpeed   = "windspeed_10m"
    const val humidity    = "relativehumidity_2m"
}
