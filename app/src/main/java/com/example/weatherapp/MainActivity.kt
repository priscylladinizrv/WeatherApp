package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
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

}
