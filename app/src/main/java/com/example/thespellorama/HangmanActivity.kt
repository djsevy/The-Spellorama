package com.example.thespellorama
import java.util.Random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class HangmanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)

        // Adding navigation to the Home screen...

        val navigateToHome = findViewById<Button>(R.id.hangmanHomeButton)

        navigateToHome.setOnClickListener {

            val homeScreen = Intent(this, MainActivity::class.java)
            startActivity(homeScreen)
        }


    }
        class Words {
            val theWords = mutableListOf("David", "Grant", "Clark", "Joseph", "Dallin")
            val previousWords = mutableListOf("")
            val correctWords = mutableListOf("")



            fun main() {


            }

            fun wordSelect(): String {
                val random = Random()
                val randIndex = random.nextInt(theWords.size)
                return theWords[randIndex]
            }

            fun wordBreakdown(): MutableList<String> {
                val letters = mutableListOf("")
                for (letter in theWords)
                    letters.add(letter)
                return letters
            }

            fun userInput(){

            }

            //TODO: add fun to compare users guess against randomly chosen word.
        }





}
