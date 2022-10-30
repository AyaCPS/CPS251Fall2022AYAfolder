package com.example.lifecycleawarenessapp.ui.main
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    companion object {
        private var names: MutableLiveData<String> = MutableLiveData("")

        fun setNames(value: String) {

            names.value = names.value  + value


        }



    }
    fun getNames(): MutableLiveData<String> {
        return names

    }
}