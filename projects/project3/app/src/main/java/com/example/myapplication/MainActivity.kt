package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.billTotal.text.isBlank()) {
                binding.resultText.text = "YOU MUST ENTER A BILL AMOUNT"
            } else {
                val bill = binding.billTotal.text.toString().toFloat()
                var output = "The Tips are as follows:"
                output += "\n10% = " + String.format("%.2f", bill * 1.1)
                output += "\n15% = " + String.format("%.2f", bill * 1.15)
                output += "\n20% = " + String.format("%.2f", bill * 1.2)
                binding.resultText.text = output
            }
        }    }
}

