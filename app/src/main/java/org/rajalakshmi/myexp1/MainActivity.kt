package org.rajalakshmi.myexp1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvtext : TextView= findViewById(R.id.tvtext)
        val button1 :Button =findViewById(R.id.button1)
        val button2: Button=findViewById(R.id.button2)
        val button3 : Button=findViewById(R.id.button3)
        val linearLayout:LinearLayout=findViewById(R.id.linearLayout)
        var fontSize : Float= 5f

        var fontColor : Int = 0
        var bgcolor : Int =0
        button1.setOnClickListener{
            tvtext.setTextSize(fontSize)
            fontSize=(fontSize+5)%50
        }
        button2.setOnClickListener{
            when (fontColor%3)
            {
                0-> tvtext.setTextColor(Color.RED)
                1-> tvtext.setTextColor(Color.GREEN)
                2-> tvtext.setTextColor(Color.BLUE)

            }
            fontColor++
        }
        button3.setOnClickListener {
            when (bgcolor%3)
            {
                0-> linearLayout.setBackgroundColor(Color.RED)
                1-> linearLayout.setBackgroundColor(Color.GREEN)
                2-> linearLayout.setBackgroundColor(Color.BLUE)

            }
            bgcolor++
        }
    }
}