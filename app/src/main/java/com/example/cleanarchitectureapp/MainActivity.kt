package com.example.cleanarchitectureapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Инициализация view элементов
    private val dataTextView by lazy { findViewById<TextView>(R.id.dataText) }
    private val dataEditView by lazy { findViewById<EditText>(R.id.etSetData) }
    private val saveButton by lazy { findViewById<Button>(R.id.saveData) }
    private val getButton by lazy { findViewById<Button>(R.id.getData) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Клик по кнопке Save Data
        saveButton.setOnClickListener {

        }
        //Клик по кнопке Get Data
        getButton.setOnClickListener {

        }
    }
}