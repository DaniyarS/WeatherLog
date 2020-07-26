package com.example.weatherlog.model

import android.os.Parcel
import android.os.Parcelable
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
    var pressure: String? = null,
    var time: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(cityId)
        parcel.writeString(cityName)
        parcel.writeString(temp)
        parcel.writeString(weather)
        parcel.writeString(feelsLike)
        parcel.writeString(pressure)
        parcel.writeString(time)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Weather> {
        override fun createFromParcel(parcel: Parcel): Weather {
            return Weather(parcel)
        }

        override fun newArray(size: Int): Array<Weather?> {
            return arrayOfNulls(size)
        }
    }
}