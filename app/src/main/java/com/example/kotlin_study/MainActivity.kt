package com.example.kotlin_study

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        start.setOnClickListener {
            TimerClass.TimerStart()
        }

        stop.setOnClickListener {
            TimerClass.TimerStop()
//            TimerClass.instance.TimeCheck()
        }

        nextpage.setOnClickListener {
            val nextIntent = Intent(this, SecondActivity::class.java)

            startActivity(nextIntent)
            finish()
//            TimerClass.instance.TimeCheck()
        }
    }

}

fun nextpage() {

}

fun main() {
    var second: Int = 0
    timer(period = 1000, initialDelay = 1000)
    {
        second++
        println(second)

        if (second == 10) {
            cancel();
            print("타이머 종료")
        }

    }
    return
}

