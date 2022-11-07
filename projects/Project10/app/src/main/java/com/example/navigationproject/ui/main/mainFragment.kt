package com.example.navigationproject.ui.main
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.navigationproject.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        binding.button.setOnClickListener {
            val action : mainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()

            action.setImageNumber(1)
            Navigation.findNavController(it).navigate(action)
        }
        binding.button2.setOnClickListener {
            val action : MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()

            action.setImageNumber(2)
            Navigation.findNavController(it).navigate(action)
        }
        binding.button3.setOnClickListener {
            val action : MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()

            action.setImageNumber(3)
            Navigation.findNavController(it).navigate(action)
        }
    }

}