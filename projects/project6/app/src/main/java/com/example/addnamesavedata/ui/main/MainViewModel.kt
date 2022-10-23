package com.example.addnamesavedata.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var nameInput: MutableLiveData<String> = MutableLiveData()
    var nameList: MutableLiveData<String> = MutableLiveData("No names to display")
    private var hasInitialized: MutableLiveData<Boolean> = MutableLiveData(false)

    fun addName() {
        nameInput.let {
            if (!it.value.equals("")) {
                if (hasInitialized.value == true) {
                    nameList.value += it.value.toString() + "\n"
                } else {
                    nameList.value = it.value.toString() + "\n"
                    hasInitialized.value = true
                }
            }
        }
    }
}

