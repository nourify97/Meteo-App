package com.nourify.meteoapp.domain.repository

import com.nourify.meteoapp.domain.util.Resource
import com.nourify.meteoapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}