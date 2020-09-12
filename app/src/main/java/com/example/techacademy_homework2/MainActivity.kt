package com.example.techacademy_homework2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //インスタンス１
        val No1=Human("Tom",20,"fishing" )
        No1.say()

        val No2=Human("Tom",20,"fishing")
        No2.think()


    }
}
