package com.example.thespellorama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.*

class setDifficulty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_difficulty)

        var wordToGuess = "none"
        println("Are any of these firing")
        // Adding navigation to the Game Mode selection screen...
        val navigateToGameModeK = findViewById<Button>(R.id.kindergartenButton)

        navigateToGameModeK.setOnClickListener{
            wordToGuess = _getWord("k")
            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            gameModeScreen.putExtra("word", wordToGuess)
            startActivity(gameModeScreen)
        }
        val navigateToGameMode1 = findViewById<Button>(R.id.firstGradeButton)

        navigateToGameMode1.setOnClickListener{
            wordToGuess = _getWord("1")
            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            gameModeScreen.putExtra("word", wordToGuess)
            startActivity(gameModeScreen)
        }
        val navigateToGameMode2 = findViewById<Button>(R.id.secondGradeButton)

        navigateToGameMode2.setOnClickListener{
            wordToGuess = _getWord("2")
            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            gameModeScreen.putExtra("word", wordToGuess)
            startActivity(gameModeScreen)
        }
        val navigateToGameMode3 = findViewById<Button>(R.id.thirdGradeButton)

        navigateToGameMode3.setOnClickListener{
            wordToGuess = _getWord("3")
            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            gameModeScreen.putExtra("word", wordToGuess)
            startActivity(gameModeScreen)
        }
        val navigateToGameMode4 = findViewById<Button>(R.id.fourthGradeButton)

        navigateToGameMode4.setOnClickListener{
            wordToGuess = _getWord("4")
            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            gameModeScreen.putExtra("word", wordToGuess)
            startActivity(gameModeScreen)
        }
        val navigateToGameMode5 = findViewById<Button>(R.id.fifthGradeButton)

        navigateToGameMode5.setOnClickListener{
            wordToGuess = _getWord("5")
            val gameModeScreen = Intent(this,GameModeActivity::class.java)
            gameModeScreen.putExtra("word", wordToGuess)
            startActivity(gameModeScreen)
        }

    }
    fun _getWord(setting: String): String {

        // Finds specific path that each difficulty file is attached to for retrieval
        // of wordToGuess
        if (setting == "k") {
            return _openFile(R.raw.gradek)
        }
        else if (setting == "1") {
            return _openFile(R.raw.grade1)
        }
        else if (setting == "2") {
            return _openFile(R.raw.grade2)
        }
        else if (setting == "3") {
            return _openFile(R.raw.grade3)
        }
        else if (setting == "4") {
            return _openFile(R.raw.grade4)
        }
        else if (setting == "5") {
            return _openFile(R.raw.grade5)
        }
        return "This is broken"
    }

    fun _openFile(file : Int): String {
        val words = resources.openRawResource(file).reader().readLines()
        return words.random().uppercase()
    }
}


