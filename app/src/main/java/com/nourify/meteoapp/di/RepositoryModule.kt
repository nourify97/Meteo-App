package com.nourify.meteoapp.di

import com.nourify.meteoapp.data.location.DefaultLocationTracker
import com.nourify.meteoapp.data.repository.WeatherRepositoryImpl
import com.nourify.meteoapp.domain.location.LocationTracker
import com.nourify.meteoapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}