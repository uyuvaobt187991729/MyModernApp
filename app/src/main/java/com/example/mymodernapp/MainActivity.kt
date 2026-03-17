package com.example.mymodernapp

import android.os.Bundle
import android.app.Activity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "Hello, this is my first App built in Termux!"
        setContentView(textView)
    }
}
