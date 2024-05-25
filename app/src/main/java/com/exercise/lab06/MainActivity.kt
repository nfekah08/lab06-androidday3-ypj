package com.exercise.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.exercise.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener() {
            binding.info.text = "Android Application Development, Android Security, " +
                    "Android UI UX and Monetize Android Application"
        }

        binding.exams.setOnClickListener() {
            binding.info.text = "The exam is 50 questions multichoice in 1hour30 with passing mark 75"
        }


    }
}