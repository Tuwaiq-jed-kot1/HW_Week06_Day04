package com.sumaya.hw_week06_day04.Data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainMV : ViewModel() {
    val repo = youtubeRepo()
            fun fetchIntrestingList():LiveData<youtyubeV>{
                var videos = MutableLiveData<youtyubeV>()
                viewModelScope.launch {
                    try {
                        videos.postValue(repo.fetchIntrestingList())
                    }catch (e: Throwable){
                        Log.e("View Video", "problem: ${e.localizedMessage}")
                    }
                }
                return videos
            }

}