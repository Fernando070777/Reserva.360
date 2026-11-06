package com.example.reserva365

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ReservationDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation_detail)

        val btnVolver = findViewById<TextView>(R.id.btnVolver)
        val btnReprogramar = findViewById<Button>(R.id.btnReprogramar)
        val btnCancelar = findViewById<Button>(R.id.btnCancelar)
        val btnMarcarCompletado = findViewById<Button>(R.id.btnMarcarCompletado)

        btnVolver.setOnClickListener {
            finish()
        }

        btnReprogramar.setOnClickListener {
            Toast.makeText(this, "Reprogramar reserva", Toast.LENGTH_SHORT).show()
        }

        btnCancelar.setOnClickListener {
            Toast.makeText(this, "Reserva cancelada", Toast.LENGTH_SHORT).show()
            finish()
        }

        btnMarcarCompletado.setOnClickListener {
            Toast.makeText(this, "Reserva marcada como completada", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
