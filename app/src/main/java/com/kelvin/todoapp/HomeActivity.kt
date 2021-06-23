package com.kelvin.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay : TextView
    private lateinit var profileButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernameDisplay = findViewById(R.id.usernameDisplay)
        profileButton =findViewById(R.id.profileButton)

        profileButton.setOnClickListener {
            openProfilePage()
        }

    }
    private fun openProfilePage() {
    val intent: Intent = Intent(this, ProfileActivity::class.java)
    startActivity(intent)
    }
}