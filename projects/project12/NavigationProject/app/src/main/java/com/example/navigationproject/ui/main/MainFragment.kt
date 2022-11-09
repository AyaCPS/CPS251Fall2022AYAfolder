package com.example.navigationproject.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.navigationproject.R
import com.example.navigationproject.databinding.MainFragmentBinding
class MainFragment : Fragment() {
companion object {
    fun newInstance() = MainFragment

    }
private var _binding: MainFragmentBinding? = null
private val binding get() = _binding!!
private lateinit var viewModel: MainViewModel

override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View {
    _binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
}
override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}

override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    binding.button1.setOnClickListener {
        val action : MainFragmentDirections.ActionMainFragmentToSecondFragment =
            MainFragmentDirections.actionMainFragmentToSecondFragment()
        action.setName("Image 1")
        action.setImagePath(R.drawable.android_image_1)
        Navigation.findNavController(it).navigate(action)
    }
    binding.button2.setOnClickListener {
        val action : MainFragmentDirections.ActionMainFragmentToSecondFragment =
            MainFragmentDirections.actionMainFragmentToSecondFragment()
        action.setName("Image 2")
        action.setImagePath(R.drawable.android_image_2)
        Navigation.findNavController(it).navigate(action)
    }
    binding.button3.setOnClickListener {
        val action : MainFragmentDirections.ActionMainFragmentToSecondFragment =
            MainFragmentDirections.actionMainFragmentToSecondFragment()
        action.setName("Image 3")
        action.setImagePath(R.drawable.android_image_3)
        Navigation.findNavController(it).navigate(action)
    }
}

}