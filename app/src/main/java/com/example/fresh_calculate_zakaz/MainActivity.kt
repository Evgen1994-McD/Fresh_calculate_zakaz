package com.example.fresh_calculate_zakaz

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fresh_calculate_zakaz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Инициализация SharedPreferences
        sharedPref = getSharedPreferences("Мелкий", MODE_PRIVATE)

        // Обработчик для кнопки Calculate
        binding.buttonCalculate.setOnClickListener {
            saveValueToSharedPrefs()
        }

        // Обработчик для кнопки Result
        binding.buttonResult.setOnClickListener {
            showSavedValue()
        }
    }

    // Функция для сохранения значения в SharedPreferences
    private fun saveValueToSharedPrefs() {
        val value = binding.inputValue1.text.toString().toIntOrNull() ?: return
        with(sharedPref.edit()) {
            putInt("Мелкий", value)
            apply()
        }
    }

    // Функция для показа сохраненного значения
    private fun showSavedValue() {
        val savedValue = sharedPref.getInt("Мелкий", 0)
        Toast.makeText(this, savedValue.toString(), Toast.LENGTH_SHORT).show()
    }
}