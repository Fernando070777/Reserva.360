package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNotificaciones = findViewById<TextView>(R.id.btnNotificaciones)
        val etBuscar = findViewById<EditText>(R.id.etBuscar)

        val catMedicos = findViewById<LinearLayout>(R.id.catMedicos)
        val catBarberias = findViewById<LinearLayout>(R.id.catBarberias)
        val catRestaurantes = findViewById<LinearLayout>(R.id.catRestaurantes)
        val catBelleza = findViewById<LinearLayout>(R.id.catBelleza)

        val negocio1 = findViewById<LinearLayout>(R.id.negocio1)
        val negocio2 = findViewById<LinearLayout>(R.id.negocio2)

        val navExplorar = findViewById<TextView>(R.id.navExplorar)
        val navReservas = findViewById<TextView>(R.id.navReservas)
        val navPerfil = findViewById<TextView>(R.id.navPerfil)

        btnNotificaciones?.setOnClickListener {
            val intent = Intent(this, NotificationsActivity::class.java)
            startActivity(intent)
        }

        val openBusinessDetail = {
            val intent = Intent(this, BusinessDetailActivity::class.java)
            startActivity(intent)
        }

        val openSearchResults = {
            val intent = Intent(this, SearchResultsActivity::class.java)
            startActivity(intent)
        }

        etBuscar?.setOnClickListener { openSearchResults() }
        etBuscar?.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                openSearchResults()
            }
        }

        catMedicos?.setOnClickListener { openBusinessDetail() }
        catBarberias?.setOnClickListener { openBusinessDetail() }
        catRestaurantes?.setOnClickListener { openBusinessDetail() }
        catBelleza?.setOnClickListener { openBusinessDetail() }

        negocio1?.setOnClickListener { openBusinessDetail() }
        negocio2?.setOnClickListener { openBusinessDetail() }

        navExplorar?.setOnClickListener { openSearchResults() }

        navReservas?.setOnClickListener {
            val intent = Intent(this, MyReservationsActivity::class.java)
            startActivity(intent)
        }

        navPerfil?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
