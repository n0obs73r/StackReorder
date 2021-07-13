package com.example.reorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttona = findViewById<Button>(R.id.activitya)
        buttona.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        val buttonc = findViewById<Button>(R.id.activityc)
        buttonc.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}