package com.example.fresh_calculate_zakaz

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.fresh_calculate_zakaz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val usageClicker = findViewById<Button>(R.id.buttontousage)
        usageClicker.setOnClickListener{
            val displayIntentUsePerWeak = Intent(this,UsePerWeak::class.java)
            startActivity(displayIntentUsePerWeak)

        }
        val calcClicker = findViewById<Button>(R.id.buttontocalculate)
        calcClicker.setOnClickListener{
            val displayIntentCalculate = Intent(this,Calculate::class.java)
            startActivity(displayIntentCalculate)

        }
    }
}
