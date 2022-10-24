package com.example.recycler_view

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_add_person.*

class AddPersonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_person)

        button.setOnClickListener {
            val personName = textName.text.toString()
            val age = textPassword.text.toString()
            Log.i(TAG, "PersonName: $personName, age: $age")
        }
    }
}