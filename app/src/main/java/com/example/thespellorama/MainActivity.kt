package com.example.thespellorama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Adding navigation to the Difficulty selection screen...

        val navigateToDifficulty = findViewById<Button>(R.id.k6Button)

        navigateToDifficulty.setOnClickListener{

            val difficultyScreen = Intent(this,setDifficulty::class.java)
            startActivity(difficultyScreen)
        }

    }

}

