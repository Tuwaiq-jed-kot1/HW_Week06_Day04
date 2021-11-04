package com.sumaya.hw_week06_day04.data.network

import com.sumaya.hw_week06_day04.data.models.UserInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
    private val api = YoutubeBuilder.youtubeApi

    suspend fun fetchVideoInfo(): UserInfo = withContext(Dispatchers.IO) {
        api.fetchVideoInfo()
    }
}