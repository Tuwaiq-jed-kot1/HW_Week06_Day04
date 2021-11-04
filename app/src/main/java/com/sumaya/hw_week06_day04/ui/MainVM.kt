package com.sumaya.hw_week06_day04.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

import com.sumaya.hw_week06_day04.data.models.Json4Kotlin_Base
import com.sumaya.hw_week06_day04.data.network.YoutubeRpo
class MainVM: ViewModel() {
    val repo = YoutubeRpo()
    fun fetchInterestingList(): LiveData<Json4Kotlin_Base>{
        val video = MutableLiveData<Json4Kotlin_Base>()
        viewModelScope.launch {
            try {
                video.postValue(repo.fetchInterestingList())
            } catch (e: Throwable) {
                Log.e("Flickr Image","Flickr Image Problem: ${e.localizedMessage}")
            }
        }
        return video
    }

}