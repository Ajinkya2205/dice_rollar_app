package com.example.dicerollarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button=findViewById(R.id.btn)
        val img: ImageView=findViewById(R.id.dice_img)

        btn.setOnClickListener(){
            var num= Random.nextInt(1, 7)
            if(num==1){
                img.setImageResource(R.drawable.dice1)
            }
            if(num==2){
                img.setImageResource(R.drawable.dice2)
            }
            if(num==3){
                img.setImageResource(R.drawable.dice3)
            }
            if(num==4){
                img.setImageResource(R.drawable.dice4)
            }
            if(num==5){
                img.setImageResource(R.drawable.dice5)
            }
            if(num==6){
                img.setImageResource(R.drawable.dice6)
            }
        }
    }
}