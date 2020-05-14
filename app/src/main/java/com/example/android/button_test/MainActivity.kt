package com.example.android.button_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*;

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbut:Button= findViewById(R.id.button_roll)
        rollbut.setOnClickListener { roll_dice() }
       // val cnt_up:Button=findViewById(R.id.count)
     //   cnt_up.setOnClickListener{count_up()}
    }

private fun roll_dice(){
    Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()
    val diceImage: ImageView = findViewById(R.id.dice_image)
    val randomInt =
        Random().nextInt((6 + 1) - 1) + 1
   // result.text=randomInt.toString()
    val drawableResource = when (randomInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    diceImage.setImageResource(drawableResource)
}
     /*   private fun count_up(){
        Toast.makeText(this, "count_up clicked",
            Toast.LENGTH_SHORT).show()
        val result:TextView=findViewById(R.id.text_area)
        if((result.text.toString()).equals("Hello World"))
        {
            result.text=1.toString()
        }
        if((result.text.toString()).equals("6")){}
        else
        {
            val r=(result.text.toString()).toInt()
            val r1=r+1
            result.text=r1.toString()
        }
    }*/
    private fun click1(view: View)
    {



    }
}
