package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
            //Toast.LENGTH_SHORT).show()
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        //resultText.text = "Dice Rolled!"
        val randomInt1 = Random().nextInt(6) + 1
        resultText1.text = randomInt1.toString()
        val randomInt2 = Random().nextInt(6) + 1
        resultText2.text = randomInt2.toString()
        val randomInt3 = Random().nextInt(6) + 1
        resultText3.text = randomInt3.toString()

    }
    private fun countUp(){
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if(resultText1.text =="Hello World!"){
            resultText1.text ="1"
        }else{
            var resultInt = resultText1.text.toString().toInt()
            if(resultInt<6)
                resultInt++
            resultText1.text = resultInt.toString()
        }
        if(resultText2.text =="Hello World!"){
            resultText2.text ="1"
        }else{
            var resultInt = resultText2.text.toString().toInt()
            if(resultInt<6)
                resultInt++
            resultText2.text = resultInt.toString()
        }
        if(resultText3.text =="Hello World!"){
            resultText3.text ="1"
        }else{
            var resultInt = resultText3.text.toString().toInt()
            if(resultInt<6)
                resultInt++
            resultText3.text = resultInt.toString()
        }
    }
}
