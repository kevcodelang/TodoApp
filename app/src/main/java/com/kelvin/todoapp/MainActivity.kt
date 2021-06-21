package com.kelvin.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var userName: String = "admin"
    var passWord: String = "admin"

    private lateinit var userNameInput:EditText
    private lateinit var passwordInput:EditText
    private lateinit var submitButton:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}