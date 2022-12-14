package com.example.addnamesavedata2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.addnamesavedata2.R

import com.example.addnamesavedata2.databinding.MainFragmentBinding

import com.example.addnamesavedata2.BR.myViewModel
import com.example.addnamesavedata2.DomeObserver


class MainFragment() : Fragment(){

    companion object {
        fun newInstance () = MainFragment()
    }

   // private lateinit var viewModel: MainViewModel
   // lateinit var binding: MainFragmentBinding


    private lateinit var viewModel: MainViewModel
    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!
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



    private lateinit var demoObserver: DomeObserver

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        lifecycle.addObserver(DomeObserver())
        val resultObserver = Observer<String> {
                result -> binding.output.text = result.toString()

        }

        viewModel.getNames().observe(viewLifecycleOwner, resultObserver)



    }

}