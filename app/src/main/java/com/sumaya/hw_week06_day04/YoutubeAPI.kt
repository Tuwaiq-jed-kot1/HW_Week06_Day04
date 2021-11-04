package com.sumaya.hw_week06_day04

import retrofit2.http.GET

interface YoutubeAPI {

    @GET("https://api.letsbuildthatapp.com/youtube/home_feed/")
    suspend fun fetchVideoInfo(): YoutubeData
}