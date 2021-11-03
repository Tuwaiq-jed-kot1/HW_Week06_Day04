package com.sumaya.hw_week06_day04.data.network

import com.sumaya.hw_week06_day04.data.models.YouTubeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YouTubeRepo {
    private val api = YouTubeBuilder.youTubeAPI
    private val tag = "YouTubeRepo"
    suspend fun fetchVideos(): YouTubeData = withContext(Dispatchers.IO){
        api.fetchVideos()
    }
}