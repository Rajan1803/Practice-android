package com.example.fragmentdatapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listview = findViewById<ListView>(R.id.listview)
        listview.adapter = ListViewAdapter(this)

    }
}