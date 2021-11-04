package com.sumaya.hw_week06_day04

import retrofit2.http.GET

interface YTApi {
    @GET("home_feed")
    suspend fun fetchVideoInfo(): YTData

}
