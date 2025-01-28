package com.example.fresh_calculate_zakaz

import android.content.SharedPreferences
import android.os.Bundle
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
       sharedPref = getSharedPreferences("WeeklyValues", MODE_PRIVATE )
        loadValuesFromSharedPrefs()

        binding.smallSalMon.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_mon", binding.smallSalMon.text.toString())
            }
        }
        binding.smallSalTue.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_tue", binding.smallSalTue.text.toString())
            }
        }

        binding.smallSalWed.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_wed", binding.smallSalWed.text.toString())
            }
        }

        binding.smallSalThu.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_thu", binding.smallSalThu.text.toString())
            }
        }

        binding.smallSalFri.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_fri", binding.smallSalFri.text.toString())
            }
        }

        binding.smallSalSat.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_sat", binding.smallSalSat.text.toString())
            }
        }

        binding.smallSalSun.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("small_sal_sun", binding.smallSalSun.text.toString())
            }
        }
        // Ниже для крупного салата


        binding.BS1.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS1", binding.BS1.text.toString())
            }
        }
        binding.BS2.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS2", binding.BS2.text.toString())
            }
        }
        binding.BS3.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS3", binding.BS3.text.toString())
            }
        }
        binding.BS4.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS4", binding.BS4.text.toString())
            }
        }
        binding.BS5.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS5", binding.BS5.text.toString())
            }
        }
        binding.BS6.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS6", binding.BS6.text.toString())
            }
        }
        binding.BS7.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("BS7", binding.BS7.text.toString())
            }
        }


//Свежий лук

        binding.O1.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O1", binding.O1.text.toString())
            }
        }
        binding.O2.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O2", binding.O2.text.toString())
            }
        }
        binding.O3.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O3", binding.O3.text.toString())
            }
        }
        binding.O4.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O4", binding.O4.text.toString())
            }
        }
        binding.O5.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O5", binding.O5.text.toString())
            }
        }
        binding.O6.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O6", binding.O6.text.toString())
            }
        }
        binding.O7.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("O7", binding.O7.text.toString())
            }
        }
// Черри


        binding.Ch1.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch1", binding.Ch1.text.toString())
            }
        }

        binding.Ch2.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch2", binding.Ch2.text.toString())
            }
        }
        binding.Ch3.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch3", binding.Ch3.text.toString())
            }
        }
        binding.Ch4.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch4", binding.Ch4.text.toString())
            }
        }
        binding.Ch5.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch5", binding.Ch5.text.toString())
            }
        }
        binding.Ch6.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch6", binding.Ch6.text.toString())
            }
        }
        binding.Ch7.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ch7", binding.Ch7.text.toString())
            }
        }


        // Помидоры



        binding.Tom1.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom1", binding.Tom1.text.toString())
            }
        }

        binding.Tom2.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom2", binding.Tom2.text.toString())
            }
        }

        binding.Tom3.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom3", binding.Tom3.text.toString())
            }
        }

        binding.Tom4.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom4", binding.Tom4.text.toString())
            }
        }

        binding.Tom5.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom5", binding.Tom5.text.toString())
            }
        }

        binding.Tom6.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom6", binding.Tom6.text.toString())
            }
        }

        binding.Tom7.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Tom7", binding.Tom7.text.toString())
            }
        }


        // Морковь


        binding.Car1.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car1", binding.Car1.text.toString())
            }
        }
        binding.Car2.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car2", binding.Car2.text.toString())
            }
        }
        binding.Car3.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car3", binding.Car3.text.toString())
            }
        }
        binding.Car4.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car4", binding.Car4.text.toString())
            }
        }
        binding.Car5.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car5", binding.Car5.text.toString())
            }
        }
        binding.Car6.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car6", binding.Car6.text.toString())
            }
        }
        binding.Car7.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Car7", binding.Car7.text.toString())
            }
        }
//Яблоки

        binding.Ap1.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap1", binding.Ap1.text.toString())
            }
        }
        binding.Ap2.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap2", binding.Ap2.text.toString())
            }
        }
        binding.Ap3.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap3", binding.Ap3.text.toString())
            }
        }
        binding.Ap4.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap4", binding.Ap4.text.toString())
            }
        }
        binding.Ap5.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap5", binding.Ap5.text.toString())
            }
        }
        binding.Ap6.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap6", binding.Ap6.text.toString())
            }
        }
        binding.Ap7.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                saveValueToSharedPrefs("Ap7", binding.Ap7.text.toString())
            }
        }








    }

private fun loadValuesFromSharedPrefs(){
    // Мелкий салат
    binding.smallSalMon.setText(sharedPref.getString("small_sal_mon", ""))
    binding.smallSalTue.setText(sharedPref.getString("small_sal_tue", ""))
    binding.smallSalWed.setText(sharedPref.getString("small_sal_wed", ""))
    binding.smallSalThu.setText(sharedPref.getString("small_sal_thu", ""))
    binding.smallSalFri.setText(sharedPref.getString("small_sal_mon", ""))
    binding.smallSalSat.setText(sharedPref.getString("small_sal_sat", ""))
    binding.smallSalSun.setText(sharedPref.getString("small_sal_sun", ""))
        // Крупный салат
    binding.BS1.setText(sharedPref.getString("BS1", ""))
    binding.BS2.setText(sharedPref.getString("BS2", ""))
    binding.BS3.setText(sharedPref.getString("BS3", ""))
    binding.BS4.setText(sharedPref.getString("BS4", ""))
    binding.BS5.setText(sharedPref.getString("BS5", ""))
    binding.BS6.setText(sharedPref.getString("BS6", ""))
    binding.BS7.setText(sharedPref.getString("BS7", ""))
    // Свежий лук
    binding.O1.setText(sharedPref.getString("O1", ""))
    binding.O2.setText(sharedPref.getString("O2", ""))
    binding.O3.setText(sharedPref.getString("O3", ""))
    binding.O4.setText(sharedPref.getString("O4", ""))
    binding.O5.setText(sharedPref.getString("O5", ""))
    binding.O6.setText(sharedPref.getString("O6", ""))
    binding.O7.setText(sharedPref.getString("O7", ""))
    // Черри
    binding.Ch1.setText(sharedPref.getString("Ch1", ""))
    binding.Ch2.setText(sharedPref.getString("Ch2", ""))
    binding.Ch3.setText(sharedPref.getString("Ch3", ""))
    binding.Ch4.setText(sharedPref.getString("Ch4", ""))
    binding.Ch5.setText(sharedPref.getString("Ch5", ""))
    binding.Ch6.setText(sharedPref.getString("Ch6", ""))
    binding.Ch7.setText(sharedPref.getString("Ch7", ""))
    // Помидоры
    binding.Tom1.setText(sharedPref.getString("Tom1", ""))
    binding.Tom2.setText(sharedPref.getString("Tom2", ""))
    binding.Tom3.setText(sharedPref.getString("Tom3", ""))
    binding.Tom4.setText(sharedPref.getString("Tom4", ""))
    binding.Tom5.setText(sharedPref.getString("Tom5", ""))
    binding.Tom6.setText(sharedPref.getString("Tom6", ""))
    binding.Tom7.setText(sharedPref.getString("Tom7", ""))
// Морковь
    binding.Car1.setText(sharedPref.getString("Car1", ""))
    binding.Car2.setText(sharedPref.getString("Car2", ""))
    binding.Car3.setText(sharedPref.getString("Car3", ""))
    binding.Car4.setText(sharedPref.getString("Car4", ""))
    binding.Car5.setText(sharedPref.getString("Car5", ""))
    binding.Car6.setText(sharedPref.getString("Car6", ""))
    binding.Car7.setText(sharedPref.getString("Car7", ""))
    // Яблоки
    binding.Ap1.setText(sharedPref.getString("Ap1", ""))
    binding.Ap2.setText(sharedPref.getString("Ap2", ""))
    binding.Ap3.setText(sharedPref.getString("Ap3", ""))
    binding.Ap4.setText(sharedPref.getString("Ap4", ""))
    binding.Ap5.setText(sharedPref.getString("Ap5", ""))
    binding.Ap6.setText(sharedPref.getString("Ap6", ""))
    binding.Ap7.setText(sharedPref.getString("Ap7", ""))










}


    private fun saveValueToSharedPrefs(key: String, value: String) {
        with(sharedPref.edit()) {
            putString(key, value)
            apply()
        }
    }



}