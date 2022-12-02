package com.nourify.meteoapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET(Queries.URL_SEARCH_QUERY)
    suspend fun getWeatherData(
        @Query(Queries.LATITUDE) lat: Double,
        @Query(Queries.LONGITUDE) long: Double
    ): WeatherDto
}

object Queries {
    const val LATITUDE = "latitude"
    const val LONGITUDE = "longitude"
    const val URL_SEARCH_QUERY = "v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl"
}