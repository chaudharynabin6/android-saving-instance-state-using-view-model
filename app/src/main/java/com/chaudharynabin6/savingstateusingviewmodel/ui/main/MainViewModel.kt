package com.chaudharynabin6.savingstateusingviewmodel.ui.main

import android.util.Log
import androidx.lifecycle.*

class MainViewModel (private val savedStateHandle: SavedStateHandle): ViewModel() {

    val filteredData: LiveData<String?> =
        savedStateHandle.getLiveData<String>("query").switchMap { query ->

//            query contains the value of query key
//            you can as many key and store the value of query
//            now finally using the value of query you fetch data from repository

//            the main advantage of using this approach is that it survives process death
            Log.e("view model ... ", query.toString())


            MutableLiveData<String>()

//            repository.getFilteredData(query)
        }


    fun setQuery(value: String) {
       savedStateHandle["query"] = value
        val keys = savedStateHandle.keys()
        Log.e("keys ...", keys.toString())
    }


}