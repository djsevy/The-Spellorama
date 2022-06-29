package com.example.thespellorama
import java.util.Random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.Exception
import java.util.*

class HangmanActivity : AppCompatActivity() {
    private lateinit var input : EditText
    private lateinit var rightOutput : TextView
    private lateinit var wrongOutput : TextView
    private lateinit var currentWord : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)

        // Adding navigation to the Home screen...
        val checkButton = findViewById<Button>(R.id.checkButton)
        val navigateToHome = findViewById<Button>(R.id.hangmanHomeButton)

        input = findViewById(R.id.theGuess)
        rightOutput = findViewById(R.id.theWord)
        wrongOutput = findViewById(R.id.theWrong)
        currentWord = "HELLO"
        rightOutput.text = "-----"

        checkButton.setOnClickListener {
            checkWords()
        }

        navigateToHome.setOnClickListener {

            val homeScreen = Intent(this, MainActivity::class.java)
            startActivity(homeScreen)
        }


    }

    private fun checkWords(){
        var letters = ""

        try {
            val guess = input.text.toString().uppercase()
            var current = rightOutput.text.toString()
            for(i in 0 until currentWord.length) {
                if (guess.get(0) == currentWord.get(i)) {
                    letters = letters.plus(guess.get(0))
                }
                else if (current.get(i).compareTo( "-".get(0)) != 0){
                    letters = letters.plus(current.get(i))
                }
                else{
                    letters = letters.plus("-")
                }
            }
            Log.i(letters, letters)


        }
        catch (e : Exception) {
            Toast.makeText(this, "Please enter a single letter.", Toast.LENGTH_LONG).show()
        }
        input.text.clear()
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
