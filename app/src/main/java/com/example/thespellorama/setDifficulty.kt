package com.example.thespellorama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class setDifficulty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_difficulty)

        // Adding navigation to the Game Mode selection screen...

        val navigateToGameMode = findViewById<Button>(R.id.kindergartenButton)

        navigateToGameMode.setOnClickListener{

            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            startActivity(gameModeScreen)
        }


    }
}