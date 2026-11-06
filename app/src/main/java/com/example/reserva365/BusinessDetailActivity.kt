package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BusinessDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business_detail)

        val btnVolver = findViewById<TextView>(R.id.btnVolver)
        val btnAgendarReserva = findViewById<Button>(R.id.btnAgendarReserva)

        btnVolver.setOnClickListener {
            finish()
        }

        btnAgendarReserva.setOnClickListener {
            val intent = Intent(this, ScheduleReservationActivity::class.java)
            startActivity(intent)
        }
    }
}
