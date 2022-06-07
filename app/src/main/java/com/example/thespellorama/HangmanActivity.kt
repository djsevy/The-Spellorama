package com.example.thespellorama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HangmanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)

        // Adding navigation to the Home screen...

        val navigateToHome = findViewById<Button>(R.id.hangmanHomeButton)

        navigateToHome.setOnClickListener{

            val homeScreen = Intent(this,MainActivity::class.java)
            startActivity(homeScreen)
        }


    }
}