package com.example.homeofthedragon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class ElectionActivity : AppCompatActivity() {

    private lateinit var tvElection: TextView
    private lateinit var checkBox1: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_election)

        //obtener una referencia a la etiqueta de la actividad
        val tvGreeting = findViewById<TextView>(R.id.tvElection)

        //recogemos el nombre del intent
        val name = intent.getStringExtra(MainActivity.NAME)
        //creamos la cadena del saludo
        tvGreeting.apply {
            //toma el valor de la cadena "greeting" y le incorpora el valor del nombre.
            text = getString(R.string.election, name)
        }
        if(checkBox1.isChecked){

        }
    }
}