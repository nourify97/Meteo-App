package com.nourify.meteoapp.data.repository

import com.nourify.meteoapp.data.mappers.toWeatherInfo
import com.nourify.meteoapp.data.remote.WeatherApi
import com.nourify.meteoapp.domain.repository.WeatherRepository
import com.nourify.meteoapp.domain.util.Resource
import com.nourify.meteoapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}