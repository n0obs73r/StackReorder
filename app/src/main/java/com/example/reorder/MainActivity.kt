package com.example.reorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonb = findViewById<Button>(R.id.activityb)
        buttonb.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        val buttonc = findViewById<Button>(R.id.activityc)
        buttonc.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}
