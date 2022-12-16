 package com.example.stopwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

     private lateinit var textview: TextView
     lateinit var btntimer: Button
    lateinit var textInfo: TextView
    lateinit var btnfun: Button
    lateinit var btnweb: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var textView : TextView
        setContentView(R.layout.activity_main)

        btntimer=findViewById(R.id.btn_1)
        btnfun=findViewById(R.id.btn_2)
        btnweb=findViewById(R.id.btn_3)
        textInfo=findViewById(R.id.txt_view)

        btntimer.setOnClickListener {
            val timerintent= Intent(this,twoActivity::class.java)
            startActivity(timerintent)
        }

        btnfun.setOnClickListener {
            val funintent= Intent(this,funActivity::class.java )
            startActivity(funintent)

        }

        btnweb.setOnClickListener {
            val webintent= Intent(this,WebActivity::class.java)
            startActivity(webintent)
        }

        textview = findViewById(R.id.textView)

        // time count down for 30 seconds,
        // with 1 second as countDown interval
        object : CountDownTimer(30000, 1000) {

            // Callback function, fired on regular interval
            override fun onTick(millisUntilFinished: Long) {
                textview.setText("seconds remaining: " + millisUntilFinished / 1000)
            }

            // Callback function, fired
            // when the time is up
            override fun onFinish() {
                textview.setText("done!")
            }
        }.start()
    }
 }