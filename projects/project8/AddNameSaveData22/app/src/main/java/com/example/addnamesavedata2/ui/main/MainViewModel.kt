package com.example.addnamesavedata2.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var names : MutableLiveData<String> = MutableLiveData(" ")
    var newName :MutableLiveData<String> = MutableLiveData(" ")

    fun addName() {
        names.value = names.value + newName.value + "\n"
    }
}