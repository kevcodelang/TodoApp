package com.kelvin.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvin.todoapp.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}