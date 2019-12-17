package com.example.weatherapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val sp: SharedPreferences by lazy {
    getSharedPreferences("my_sp", Context.MODE_PRIVATE)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


  }

  override fun onResume() {
    super.onResume()
    readRadioButton()
  }


  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    val inflater = menuInflater
    inflater.inflate(R.menu.menu, menu)
    return true
  }


  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    // Handle item selection
    when (item.getItemId()) {
      R.id.options1 -> {
        val intentSettings = Intent(this, Settings::class.java)
        startActivity(intentSettings)
        return true
      }
      else -> return super.onOptionsItemSelected(item)
    }
  }


  private fun readRadioButton() {

    sp.getString("TemperatureUnit", "°C")
    sp.getString("TemperatureUnit", "ºF")
    sp.getString("TemperatureLanguage", "EN")
    sp.getString("TemperatureLanguage", "PE")

    textView.text = "Temperatura selecionada:\n\n ${sp.getString("TemperatureUnit", "°C")}\n\n Linguagem selecionada:\n\n ${sp.getString("TemperatureLanguage", "PT")} "

  }

}
