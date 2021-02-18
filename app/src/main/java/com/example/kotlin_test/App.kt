package com.example.orthosis_sync

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log

class App : Activity() {

    init {
        instance = this
    }

    companion object {
        private var instance: App? = null
        lateinit var context: Context
    }
}

//class App : Application() {
//    init {
//        instance = this
//    }
//
//    companion object {
//        lateinit var mContext: Context
//        var instance: App? = null
//
//        fun applicationContext(): Context {
//            return instance!!.applicationContext
//        }
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//        val context: Context = App.applicationContext()
//    }
//}