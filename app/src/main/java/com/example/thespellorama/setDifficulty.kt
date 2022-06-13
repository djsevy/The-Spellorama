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

        // Difficulty Selection Idea:
        // The difficulty will be based on 7 different files corresponding to the grade selected.
        // Kindergarten will have 5 easy words in it's file, First grade will add 3 more "harder" words to it's file and so forth
        // Up until 6th grade (this file will contain all the words).

    }
}