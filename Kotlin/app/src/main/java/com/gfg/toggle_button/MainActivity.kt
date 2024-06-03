package com.gfg.toggle_button

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var toggleButton: ToggleButton
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.button_toggle)
        textView = findViewById(R.id.textView1)

    }

    fun onToggleClick(view: View) {
        if (toggleButton.isChecked) {
            textView.text = "Toggle is ON"
        } else {
            textView.text = "Toggle is OFF"
        }
    }
}