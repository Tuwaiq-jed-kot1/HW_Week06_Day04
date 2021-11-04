package com.sumaya.hw_week06_day04.network

import com.sumaya.hw_week06_day04.YouTube_Data
import com.sumaya.hw_week06_day04.network.Youtube_Builder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YouTube_Repo {


    private val api = Youtube_Builder.youtubeApi

    suspend fun fetchInterestingList(): YouTube_Data = withContext(Dispatchers.IO) {
        api.fetchVideo()
    }

}




