package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this is contained in my second commit")
        today is 1 may
        println("this is local change")
        println("this is local change stash from ui of android studio")


        println("change 11")
        println("change 22")
        println("example branch from ui of android studio")
    }
}