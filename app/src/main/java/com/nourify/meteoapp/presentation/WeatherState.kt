package com.nourify.meteoapp.presentation

import com.nourify.meteoapp.domain.util.Resource
import com.nourify.meteoapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
