package com.example.weatherapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RadioButton

const val TAG = "MainActivity"
const val FILE_NAME = "My_file"

class Settings : AppCompatActivity() {

  private val sp: SharedPreferences by lazy {
    getSharedPreferences("my_sp", Context.MODE_PRIVATE)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)

  }


  fun onRadioButtonClickedUnit(view: View) {
    if (view is RadioButton) {
      // Is the button now checked?
      val checked = view.isChecked

      // Check which radio button was clicked
      when (view.getId()) {
        R.id.radioButtonC ->
          if (checked) {
            sp.edit()
              .putString("TemperatureUnit", "°C")
              .apply()
          }
        R.id.radioButtonF ->
          if (checked) {
            sp.edit()
              .putString("TemperatureUnit", "ºF")
              .apply()
          }
      }
    }
  }


  fun onRadioButtonClickedLanguage(view: View) {
    if (view is RadioButton) {
      // Is the button now checked?
      val checked = view.isChecked

      // Check which radio button was clicked
      when (view.getId()) {
        R.id.radioButtonEN ->
          if (checked) {
            sp.edit()
              .putString("TemperatureLanguage", "EN")
              .apply()
          }
        R.id.radioButtonPT ->
          if (checked) {
            sp.edit()
              .putString("TemperatureLanguage", "PT")
              .apply()
          }
      }
    }
  }




}
