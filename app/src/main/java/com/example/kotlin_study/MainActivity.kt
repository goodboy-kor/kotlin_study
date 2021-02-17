package com.example.kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var me = A(job = "개발자")
//        me.print_profile()
//        var me2 = B("안녕", 15, "천재")
//        me2.print_profile()
//        me2.B_fun()
//
//        var me3 = C("세번째", 5, "직업은 뭘까", 99)
//        me3.print_profile()

//        var y = A_a("안녕", 1234)
//        Log.d("로그", y.q);
//        Log.d("로그", y.w.toString());
//        y.print_profile()

        var x = test()
        println(x.add(12, 100))
        println(x.add(12, 100, 1000))
    }
}

open class A(var name: String = "위석환", var age: Int = 25, var job: String) {
    open fun print_profile() {
        println("이름은 $name " + "나이는 $age " + "직업은 $job 입니다.")
    }
}

class B(name: String, age: Int, job: String) : A(name, age, job) {
    fun B_fun() {
        println("B에 속한 함수 입니다.")
    }
}

class C : A {
    var added: Int

    constructor(name: String, age: Int, job: String, added: Int) : super(name, age, job) {
        this.added = added
    }

    override fun print_profile() {
        super.print_profile()
        println(added)
    }
}

class A_a(_q: String, var w: Int) : A(job = "직업이지렁") {
    var q = _q

    init {
        Log.d("로그", q)
        Log.d("로그", w.toString())
    }

    override fun print_profile() {
        super.print_profile()
        println(q)
        println(w)
    }
}

class test() {
    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun add(x: Int, y: Int, z: Int): Int {
        return x + y + z
    }
}