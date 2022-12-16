package com.example.stopwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myquizapp.QuizActivity

class funActivity : AppCompatActivity() {

    lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun)

        submit=findViewById(R.id.submit_btn)

        submit.setOnClickListener {
            val submitintent= Intent(this,QuizActivity::class.java)
            startActivity(submitintent)
        }
    }
}