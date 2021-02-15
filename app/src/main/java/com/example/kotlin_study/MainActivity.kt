package com.example.kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("로그", "두번째 branch 입니다.");
        Log.d("로그", "두번째 branch merge 테스트 입니다.");
    }
}