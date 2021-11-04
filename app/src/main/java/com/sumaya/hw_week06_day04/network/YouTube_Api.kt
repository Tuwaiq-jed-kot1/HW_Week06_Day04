package com.sumaya.hw_week06_day04.network

import com.sumaya.hw_week06_day04.YouTube_Data
import retrofit2.http.GET

interface YouTube_Api {

    @GET("home_video")
    suspend fun fetchVideo(): YouTube_Data
}