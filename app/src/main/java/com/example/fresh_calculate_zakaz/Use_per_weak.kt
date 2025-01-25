package com.example.fresh_calculate_zakaz

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fresh_calculate_zakaz.databinding.ActivityUsePerWeakBinding

class UsePerWeak : AppCompatActivity() {

    private lateinit var binding: ActivityUsePerWeakBinding
    lateinit var sharedPref: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Активируем Data Binding
        binding = ActivityUsePerWeakBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ваша логика для обработки Window Insets
        ViewCompat.setOnApplyWindowInsetsListener(binding.usePerWeak) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        sharedPref = getSharedPreferences("МелкийПН", MODE_PRIVATE)
        sharedPref = getSharedPreferences("МелкийВТ", MODE_PRIVATE)
        sharedPref = getSharedPreferences("МелкийСР", MODE_PRIVATE)
        sharedPref = getSharedPreferences("МелкийЧТ", MODE_PRIVATE)
        sharedPref = getSharedPreferences("МелкийПТ", MODE_PRIVATE)
        sharedPref = getSharedPreferences("МелкийСБ", MODE_PRIVATE)
        sharedPref = getSharedPreferences("МелкийВС", MODE_PRIVATE)



    }



}