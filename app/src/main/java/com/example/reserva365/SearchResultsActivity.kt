package com.example.reserva365

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_results)

        val btnVolver = findViewById<TextView>(R.id.btnVolver)
        val card1 = findViewById<LinearLayout>(R.id.cardResult1)
        val card2 = findViewById<LinearLayout>(R.id.cardResult2)
        val card3 = findViewById<LinearLayout>(R.id.cardResult3)

        btnVolver.setOnClickListener {
            finish()
        }

        val openBusinessDetail = {
            val intent = Intent(this, BusinessDetailActivity::class.java)
            startActivity(intent)
        }

        card1?.setOnClickListener { openBusinessDetail() }
        card2?.setOnClickListener { openBusinessDetail() }
        card3?.setOnClickListener { openBusinessDetail() }
    }
}
