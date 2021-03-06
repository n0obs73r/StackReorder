package com.example.reorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonb = findViewById<Button>(R.id.activityb)
        val textview = findViewById<TextView>(R.id.opa)
        val str = intent.getStringExtra("str")
        if(str == null){
         textview.text = "Start Activity"
        }
        else {
            textview.text = "Opened By $str"
        }
        buttonb.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).putExtra("str", "A")
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        val buttonc = findViewById<Button>(R.id.activityc)
        buttonc.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java).putExtra("str", "C")
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            Toast.makeText(this, "Opening Activity B", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        val openedBy = intent.getStringExtra("str")
        if(openedBy != null)
            updateText(openedBy)
        else
            findViewById<TextView>(R.id.opa).text = "Start Activity"
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.getStringExtra("str")?.let { updateText(it) }
    }

    private fun updateText(activityName: String) {
        findViewById<TextView>(R.id.opa).text = "Opened By $activityName"
    }
}
