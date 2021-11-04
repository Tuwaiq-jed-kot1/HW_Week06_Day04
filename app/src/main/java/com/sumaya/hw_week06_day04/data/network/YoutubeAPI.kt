package com.sumaya.hw_week06_day04.data.network

import com.sumaya.hw_week06_day04.data.model.UserInfo
import retrofit2.http.GET

interface YoutubeAPI {

    @GET("home_feed")
    suspend fun fetchVideosInfo():UserInfo
}