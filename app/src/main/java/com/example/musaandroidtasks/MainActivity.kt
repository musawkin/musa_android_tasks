package com.example.musaandroidtasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.core.view.WindowCompat
import com.example.musaandroidtasks.databinding.Homework15Task1Binding
import com.example.musaandroidtasks.databinding.Homework15Task3Binding
import com.example.musaandroidtasks.databinding.Task2Binding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: Homework15Task1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Homework15Task1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.readMoreButton.setOnClickListener{
            binding.textView23.maxLines = Int.MAX_VALUE
            binding.readMoreButton.visibility = TextView.GONE
        }



        WindowCompat.setDecorFitsSystemWindows(
            window,
            false
        )

        }

        }






