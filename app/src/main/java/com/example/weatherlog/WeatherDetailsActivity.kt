package com.example.weatherlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weather_details.*

class WeatherDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_details)

        val cityName = intent.getStringExtra("cityName")
        val weather =  intent.getStringExtra("weather")
        val temp = intent.getStringExtra("temp")
        val feelsLike = intent.getStringExtra("feelsLike")
        val pressure = intent.getStringExtra("pressure")

        this.title = "Weather in $cityName"
        tvWeatherIndex.text = weather
        tvTempIndex.text = temp
        tvFeelsLikeIndex.text = feelsLike
        tvPressureIndex.text = pressure
    }
}