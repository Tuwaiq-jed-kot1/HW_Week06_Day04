package com.sumaya.hw_week06_day04.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.network.YouTube_Repo
import com.sumaya.hw_week06_day04.YouTube_Data
import kotlinx.coroutines.launch

class MainVM :ViewModel(){

    val repo = YouTube_Repo()
    fun fetchInterestingList(): LiveData<YouTube_Data> {
        val video = MutableLiveData<YouTube_Data>()
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