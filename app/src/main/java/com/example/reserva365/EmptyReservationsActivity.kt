package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EmptyReservationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_reservations)

        val btnExplorar = findViewById<Button>(R.id.btnExplorar)
        val navInicio = findViewById<TextView>(R.id.navInicio)
        val navExplorar = findViewById<TextView>(R.id.navExplorar)
        val navPerfil = findViewById<TextView>(R.id.navPerfil)

        btnExplorar.setOnClickListener {
            val intent = Intent(this, SearchResultsActivity::class.java)
            startActivity(intent)
            finish()
        }

        navInicio?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        navExplorar?.setOnClickListener {
            val intent = Intent(this, SearchResultsActivity::class.java)
            startActivity(intent)
            finish()
        }

        navPerfil?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
