package com.sumaya.hw_week06_day04.dataNetwork


import com.sumaya.hw_week06_day04.FlickrData
import com.sumaya.hw_week06_day04.Json4Kotlin_Base
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext



class FlickrRepo {
    private val tag = "FlickrRepo"
    private val api = FlickrBuilder.flickrAPI

    suspend fun fetchInterestingList(): Json4Kotlin_Base = withContext(Dispatchers.IO){
       api.fetchPhotos()
    }
}