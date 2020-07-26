package com.example.weatherlog.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_table")
data class Weather(
    @PrimaryKey(autoGenerate = true)
    var cityId: Int = 0,
    var cityName: String? = null,
    var temp: String? = null,
    var weather: String? = null,
    var feelsLike: String? = null,
    var pressure: String? = null
)