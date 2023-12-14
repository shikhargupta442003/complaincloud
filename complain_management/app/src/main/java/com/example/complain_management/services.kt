package com.example.complain_management

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class services : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val items = arrayOf("One","Two","Three","Four","Five")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.auto_complete_txt)
        autoCompleteTextView.setAdapter(adapter)

        val autoCompleteTextView1 = findViewById<AutoCompleteTextView>(R.id.auto_complete_txt1)
        autoCompleteTextView1.setAdapter(adapter)

        val autoCompleteTextView2 = findViewById<AutoCompleteTextView>(R.id.auto_complete_txt2)
        autoCompleteTextView2.setAdapter(adapter)

        val autoCompleteTextView3 = findViewById<AutoCompleteTextView>(R.id.auto_complete_txt3)
        autoCompleteTextView3.setAdapter(adapter)

        val autoCompleteTextView4 = findViewById<AutoCompleteTextView>(R.id.auto_complete_txt4)
        autoCompleteTextView4.setAdapter(adapter)

        val autoCompleteTextView5 = findViewById<AutoCompleteTextView>(R.id.auto_complete_txt5)
        autoCompleteTextView5.setAdapter(adapter)


    }
}