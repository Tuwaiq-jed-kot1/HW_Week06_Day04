package com.sumaya.hw_week06_day04.network

import com.sumaya.hw_week06_day04.models.YouTubData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YouTubeRepo {
    private val api = YouTubeBuilder.youTubeAPI

    suspend fun youTubeInfo(): YouTubData= withContext(Dispatchers.IO){
        api.vidsInfo()
    }
}