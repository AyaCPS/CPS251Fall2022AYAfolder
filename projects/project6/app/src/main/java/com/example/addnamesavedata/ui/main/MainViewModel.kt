package com.example.addnamesavedata.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var storedNames:String = ""

    fun setNameList(value:String) {
        storedNames = value + "\n" + storedNames;
    }

    fun getNameList():String {
        return storedNames;
    }



}