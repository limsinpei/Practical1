package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

//import android.widget.Toast
//import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }
        //rollButton.setOnClickListener { rollDice2() }
        //rollButton.setOnClickListener { rollDice3() }
    }


    private fun rollDice()
    {
        //Toast.makeText(this,"button clicked",
        //    Toast.LENGTH_SHORT).show()


        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        val randomInt2 = Random().nextInt(6) + 1
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt2.toString()

        val randomInt3 = Random().nextInt(6) + 1
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText3.text = randomInt3.toString()

    }


}
