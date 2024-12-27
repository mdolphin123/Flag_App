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
import com.example.flagapp.databinding.ActivityMainBinding

class profile : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        val button = findViewById<View>(R.id.button4)
        val button2 = findViewById<View>(R.id.button3)
        val button3 = findViewById<View>(R.id.button5)
        val logout = findViewById<View>(R.id.test)
        button2.setOnClickListener {
            val handler3 = Handler()
            button2.setBackgroundColor(getResources().getColor(R.color.darkpink))
            button.setBackgroundColor(getResources().getColor(R.color.pink))
            button3.setBackgroundColor(getResources().getColor(R.color.pink))
            handler3.postDelayed({
                val i = Intent(this@profile, mainpage::class.java)
                startActivity(i)
            } ,500)
        }
        button.setOnClickListener {
            val handler3 = Handler()
            button.setBackgroundColor(getResources().getColor(R.color.darkpink))
            button2.setBackgroundColor(getResources().getColor(R.color.pink))
            button3.setBackgroundColor(getResources().getColor(R.color.pink))
            handler3.postDelayed({
                val i = Intent(this@profile, battery::class.java)
                startActivity(i)
            } ,500)
        }


        logout.setOnClickListener {
            val handler3 = Handler()
            logout.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerborder1))
            handler3.postDelayed({
                val i = Intent(this@profile, register::class.java)
                startActivity(i)
            } ,500)
        }

    }
}