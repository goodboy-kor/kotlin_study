package com.example.kotlin_study

import java.util.*

class TimerClass() {
    companion object {
        var timerTask: Timer? = null
        var isRunning = false
        var time: Long = 0
        var sec: Long = 0
        var minute: Long = 0
        var hour: Long = 0

        fun TimerStart() {
            timerTask = kotlin.concurrent.timer(period = 1000) {
                time++    //period 1000 = 1초
                sec = time % 60
                minute = (time / 60) % 60
                hour = (time / 3600)
//                 UI조작을 위한 메서드 (activity 내부에서 동작)
//            runOnUiThread {
//                println(sec)
////                secText.text = "$sec"    // TextView 세팅
////                milliText.text = "$milli"    // Textview 세팅
//            }
                println(hour.toString() + " : " + minute.toString() + " : " + sec.toString())
            }
        }

        fun TimerStop() {
            if (isRunning) {
                TimerStart()
            } else {
                TimerPause()
            }
        }

        fun TimerPause() {
            timerTask?.cancel()
        }

        fun TimerReset() {
            time = 0
            isRunning = false
        }

    }


//    val timer = timer(period = 1000, initialDelay = 1000) {
//        sec++
//        handler.obtainMessage(sec)
//    }
//    val handler = Handler {
//        when (it.what) {
//            10 -> {
//                println("1초지남")
//                false
//            }
//            20 -> {
//                println("2초지남")
//            }
//        }
//        true
//    }
}