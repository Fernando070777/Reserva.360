package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScheduleReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_reservation)

        val btnVolver = findViewById<TextView>(R.id.btnVolver)
        val btnCalCancel = findViewById<TextView>(R.id.btnCalCancel)
        val btnCalOk = findViewById<TextView>(R.id.btnCalOk)
        val btnTimeCancel = findViewById<TextView>(R.id.btnTimeCancel)
        val btnTimeOk = findViewById<TextView>(R.id.btnTimeOk)

        btnVolver.setOnClickListener {
            finish()
        }

        btnCalCancel.setOnClickListener {
            finish()
        }

        btnTimeCancel.setOnClickListener {
            finish()
        }

        val navigateToSuccess = {
            val intent = Intent(this, ReservationSuccessActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnCalOk.setOnClickListener {
            navigateToSuccess()
        }

        btnTimeOk.setOnClickListener {
            navigateToSuccess()
        }
    }
}
