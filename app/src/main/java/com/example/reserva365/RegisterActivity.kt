package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val tvIniciarSesion = findViewById<TextView>(R.id.tvIniciarSesion)

        btnRegistrar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        tvIniciarSesion.setOnClickListener {
            finish()
        }
    }
}
