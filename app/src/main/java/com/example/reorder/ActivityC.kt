package com.example.reorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttona = findViewById<Button>(R.id.activitya)
        buttona.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        val buttonb = findViewById<Button>(R.id.activityb)
        buttonb.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)


        }
    }
}