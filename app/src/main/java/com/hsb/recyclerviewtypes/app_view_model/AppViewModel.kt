package com.hsb.recyclerviewtypes.app_view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel(application: Application) : AndroidViewModel(application) {

    var inComingArray = MutableLiveData<List<String>>()
    var outGoingArray = MutableLiveData<List<String>>()


}