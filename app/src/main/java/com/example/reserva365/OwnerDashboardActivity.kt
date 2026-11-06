package com.example.reserva365

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OwnerDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owner_dashboard)

        val btnVolver = findViewById<TextView>(R.id.btnVolver)
        val btnAjustes = findViewById<TextView>(R.id.btnAjustes)

        val btnAceptar1 = findViewById<Button>(R.id.btnAceptar1)
        val btnRechazar1 = findViewById<Button>(R.id.btnRechazar1)

        val btnAceptar2 = findViewById<Button>(R.id.btnAceptar2)
        val btnRechazar2 = findViewById<Button>(R.id.btnRechazar2)

        val btnBloquearHorarios = findViewById<Button>(R.id.btnBloquearHorarios)

        btnVolver.setOnClickListener {
            finish()
        }

        btnAjustes.setOnClickListener {
            Toast.makeText(this, "Ajustes de dueño", Toast.LENGTH_SHORT).show()
        }

        btnAceptar1.setOnClickListener {
            Toast.makeText(this, "Reserva de María G. aceptada", Toast.LENGTH_SHORT).show()
        }

        btnRechazar1.setOnClickListener {
            Toast.makeText(this, "Reserva de María G. rechazada", Toast.LENGTH_SHORT).show()
        }

        btnAceptar2.setOnClickListener {
            Toast.makeText(this, "Reserva de Carlos R. aceptada", Toast.LENGTH_SHORT).show()
        }

        btnRechazar2.setOnClickListener {
            Toast.makeText(this, "Reserva de Carlos R. rechazada", Toast.LENGTH_SHORT).show()
        }

        btnBloquearHorarios.setOnClickListener {
            Toast.makeText(this, "Horarios bloqueados", Toast.LENGTH_SHORT).show()
        }
    }
}
