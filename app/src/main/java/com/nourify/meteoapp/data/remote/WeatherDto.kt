package com.nourify.meteoapp.data.remote

import com.squareup.moshi.Json

const val hourly: String = "hourly"

data class WeatherDto(
    @field:Json(name= hourly)
    val weatherData: WeatherDataDto
)
