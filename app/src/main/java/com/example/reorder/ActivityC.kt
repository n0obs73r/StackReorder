package com.example.reorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val textview = findViewById<TextView>(R.id.opa)
        val str = intent.getStringExtra("str")
        textview.text = "Opened By $str"

        val buttona = findViewById<Button>(R.id.activitya)
        buttona.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).putExtra("str", "A")
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        val buttonb = findViewById<Button>(R.id.activityb)
        buttonb.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).putExtra("str", "C")
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        val openedBy = intent.getStringExtra("str")
        openedBy?.let { updateText(it) }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.getStringExtra("str")?.let { updateText(it) }
    }

    private fun updateText(activityName: String) {
        findViewById<TextView>(R.id.opa).text = "Opened By $activityName"
    }
}