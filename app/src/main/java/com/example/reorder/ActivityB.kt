package com.example.reorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttona = findViewById<Button>(R.id.activitya)
        val textview = findViewById<TextView>(R.id.opa)
        val str = intent.getStringExtra("str")
        textview.text = "Opened By $str"
        buttona.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).putExtra("str", "B")
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        val buttonc = findViewById<Button>(R.id.activityc)
        buttonc.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java).putExtra("str", "B")
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}