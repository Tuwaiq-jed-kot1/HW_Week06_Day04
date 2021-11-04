package com.shady.restandretrofit.data.network

import com.sumaya.hw_week06_day04.YoutubeData
import retrofit2.Call
import retrofit2.http.GET

interface YoutubeAPI {
    // for a working version, add a flickrAPIKey to your local.properties file, e.g. flickrAPIKey ="nnnnn"
    @GET("youtube/home_feed")
    suspend fun fetchPhotos(): YoutubeData
}