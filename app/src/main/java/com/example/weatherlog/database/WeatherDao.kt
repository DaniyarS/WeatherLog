package com.example.weatherlog.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weatherlog.model.Weather

interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWeather(weather: Weather)

    @Query("Select * From weather_table")
    fun getAllWeather(): LiveData<List<Weather>>

    @Insert
    fun insertTime(time: String)
}