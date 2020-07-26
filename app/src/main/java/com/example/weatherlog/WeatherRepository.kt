package com.example.weatherlog

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.weatherlog.database.WeatherDao
import com.example.weatherlog.database.WeatherDatabase
import com.example.weatherlog.model.Weather

class WeatherRepository(application: Application) {
    var weatherDao: WeatherDao? = null
    var allWeather: LiveData<List<Weather>>? = null

    private val database = WeatherDatabase.getInstance(application)
}