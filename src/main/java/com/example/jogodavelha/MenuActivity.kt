package com.example.jogodavelha

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.jogodavelha.MainActivity
import com.example.jogodavelha.databinding.ActivityMenuBinding
import com.example.jogodavelha.MenuActivity

class MenuActivity : AppCompatActivity () {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonMaquina.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        binding.buttonJogo.setOnClickListener {
            val i = Intent(this, GameActivity::class.java)
            startActivity(i)
        }
    }
}