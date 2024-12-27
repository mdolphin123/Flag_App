package com.example.flagapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ui.AppBarConfiguration

class battery : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: battery

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.battery)

        val button = findViewById<View>(R.id.button4)
        val button2 = findViewById<View>(R.id.button3)
        val button3 = findViewById<View>(R.id.button5)
        button2.setOnClickListener {
            val handler3 = Handler()
            button.setBackgroundColor(getResources().getColor(R.color.darkpink))
            button2.setBackgroundColor(getResources().getColor(R.color.pink))
            button.setBackgroundColor(getResources().getColor(R.color.pink))
            handler3.postDelayed({
                val i = Intent(this@battery, mainpage::class.java)
                startActivity(i)
            } ,500)
        }

        button3.setOnClickListener {
            val handler3 = Handler()
            button3.setBackgroundColor(getResources().getColor(R.color.darkpink))
            button2.setBackgroundColor(getResources().getColor(R.color.pink))
            button.setBackgroundColor(getResources().getColor(R.color.pink))
            handler3.postDelayed({
                val i = Intent(this@battery, profile::class.java)
                startActivity(i)
            } ,500)
        }
    }
}