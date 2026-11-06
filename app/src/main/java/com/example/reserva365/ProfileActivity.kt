package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnEditarPerfil = findViewById<Button>(R.id.btnEditarPerfil)
        val btnModoDueno = findViewById<Button>(R.id.btnModoDueno)
        val btnCerrarSesion = findViewById<Button>(R.id.btnCerrarSesion)

        val navInicio = findViewById<TextView>(R.id.navInicio)
        val navReservas = findViewById<TextView>(R.id.navReservas)

        btnEditarPerfil.setOnClickListener {
            Toast.makeText(this, "Editar perfil", Toast.LENGTH_SHORT).show()
        }

        btnModoDueno.setOnClickListener {
            val intent = Intent(this, OwnerDashboardActivity::class.java)
            startActivity(intent)
        }

        btnCerrarSesion.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        navInicio?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        navReservas?.setOnClickListener {
            val intent = Intent(this, MyReservationsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
