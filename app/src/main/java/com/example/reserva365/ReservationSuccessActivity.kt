package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ReservationSuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation_success)

        val btnVerReservas = findViewById<Button>(R.id.btnVerReservas)

        btnVerReservas.setOnClickListener {
            val intent = Intent(this, MyReservationsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
