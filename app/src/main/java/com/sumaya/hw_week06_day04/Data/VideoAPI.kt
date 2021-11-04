package com.sumaya.hw_week06_day04.Data

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface VideoAPI {

    @GET("home_feed")

    suspend fun inVideo():youtyubeV
}