package com.sumaya.hw_week06_day04

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.dataNetwork.FlickrRepo
import kotlinx.coroutines.launch


class MainVM: ViewModel() {

    val repo = FlickrRepo()
    fun fetchInterestingList(): LiveData<Json4Kotlin_Base> {
        val photos = MutableLiveData<Json4Kotlin_Base>()
        viewModelScope.launch {
            try {
                photos.postValue(repo.fetchInterestingList())
            } catch (e: Throwable){
                Log.e("Flickr Images","Flickr Images Problem: ${e.localizedMessage}")
            }

        }
        return photos
    }

}