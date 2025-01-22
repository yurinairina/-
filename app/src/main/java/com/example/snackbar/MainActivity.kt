package com.example.snackbar
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity () {
    private lateinit var infCheckBox: CheckBox
    private lateinit var rulTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        infCheckBox = findViewById(R.id.infCheckBoxCB)
        rulTextView = findViewById(R.id.rulTextViewTV)

        infCheckBox.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                infCheckBox.text = getString(R.string.info_rules)
                rulTextView.text = getString(R.string.rul_text).trim()
            } else {
                rulTextView.text = ""
                infCheckBox.text = getString(R.string.info_text)
            }

        }

    }
}