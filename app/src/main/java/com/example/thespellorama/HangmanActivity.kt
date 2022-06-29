package com.example.thespellorama
import java.util.Random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import org.w3c.dom.Text
import java.lang.Exception
import java.util.*


// TODO if using JSON for words, import GSON
class HangmanActivity : AppCompatActivity() {
    private lateinit var input : EditText
    private lateinit var rightOutput : TextView
    private lateinit var wrongOutput : TextView
    private lateinit var currentWord : String
    private lateinit var youWin : ImageView
    private var lives = 6

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
        youWin = findViewById(R.id.youWinImage)
        youWin.alpha = 0F

        checkButton.setOnClickListener {
            checkWords()
        }

        navigateToHome.setOnClickListener {

            val homeScreen = Intent(this, MainActivity::class.java)
            startActivity(homeScreen)
        }


    }



    private fun pause(milliseconds: Long) {
        var timer = Object()
        synchronized(timer) {
            timer.wait(milliseconds)
        }


    }


    private fun checkWords(){
        var letters = ""

        try {
            val guess = input.text.toString().uppercase()
            var current = rightOutput.text.toString()

            var isFound = false

            for(i in 0 until currentWord.length) {
                if (guess.get(0) == currentWord.get(i)) {
                    letters = letters.plus(guess.get(0))
                    isFound = true
                }
                else if (current.get(i).compareTo( "-".get(0)) != 0){
                    letters = letters.plus(current.get(i))
                }
                else{
                    letters = letters.plus("-")
                }

            }

            rightOutput.text = letters
//          TODO the rightoutoutput delay is scuffed. Need to rework sleeping and have a youwin image.
            if (rightOutput.text.toString() == currentWord) {
                youWin.alpha = 1F
                Thread.sleep(2000L)
                super.onBackPressed()
            }


            if (isFound == false) {


                var wrongGuess = wrongOutput.text.toString()
                wrongOutput.text = wrongGuess.plus(guess)
                lives -= 1
//              TODO: display image based on how many lives are left

                when (lives) {
//                    TODO replace lives = 5... etc with image input
                    5 -> lives = 5
                    4 -> lives = 4
                    3 -> lives = 3
                    2 -> lives = 2
                    1 -> lives = 1

                    else -> {
//                        Thread.sleep(2000L)
                        Toast.makeText(this, "Oof... You lose!", Toast.LENGTH_LONG).show()
                        Thread.sleep(2000L)
                        super.onBackPressed()
                    }
//



                }
            }







        }
        catch (e : Exception) {
            Toast.makeText(this, "Please enter a single letter.", Toast.LENGTH_LONG).show()
        }
        input.text.clear()
    }







}
