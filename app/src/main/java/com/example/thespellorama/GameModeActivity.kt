package com.example.thespellorama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameModeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_mode)


        // Adding navigation to the Hangman game screen...

        val navigateToHangman = findViewById<Button>(R.id.hangmanButton)

        navigateToHangman.setOnClickListener{

            val hangmanScreen = Intent(this,HangmanActivity::class.java)
            startActivity(hangmanScreen)
        }


    }
}