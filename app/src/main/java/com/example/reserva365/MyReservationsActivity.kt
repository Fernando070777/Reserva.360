package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyReservationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_reservations)

        val navInicio = findViewById<TextView>(R.id.navInicio)
        val navExplorar = findViewById<TextView>(R.id.navExplorar)
        val navPerfil = findViewById<TextView>(R.id.navPerfil)

        val tabCanceladas = findViewById<TextView>(R.id.tabCanceladas)

        val card1 = findViewById<LinearLayout>(R.id.reservaCard1)
        val card2 = findViewById<LinearLayout>(R.id.reservaCard2)
        val card3 = findViewById<LinearLayout>(R.id.reservaCard3)
        val card4 = findViewById<LinearLayout>(R.id.reservaCard4)

        navInicio?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        navExplorar?.setOnClickListener {
            val intent = Intent(this, SearchResultsActivity::class.java)
            startActivity(intent)
        }

        navPerfil?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        tabCanceladas?.setOnClickListener {
            val intent = Intent(this, EmptyReservationsActivity::class.java)
            startActivity(intent)
        }

        val openDetail = {
            val intent = Intent(this, ReservationDetailActivity::class.java)
            startActivity(intent)
        }

        card1?.setOnClickListener { openDetail() }
        card2?.setOnClickListener { openDetail() }
        card3?.setOnClickListener { openDetail() }
        card4?.setOnClickListener { openDetail() }
    }
}
