package com.example.homeofthedragon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //Variable de inicialización tardía.
    private lateinit var btnAnswer: Button
    private lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAnswer = findViewById<Button>(R.id.btnAnswer)
        etName = findViewById<EditText>(R.id.editTextName)
        val name = etName.text

        if (intent.getBooleanExtra("Exit", false)) {
            finish()
        }
        btnAnswer.setOnClickListener {
            //El log lo usamos para imprimir en la consola de Android Studio pero en logcat.
            goToElection()
        }
    }

    private fun goToElection() {
        if (etName.text.isEmpty()) {
            Log.d("MainActivity", "El nombre está vacío")
        } else {
            //crear el intent
            val intent = Intent(this@MainActivity, ElectionActivity::class.java)
            //tomar el valor del cuadro de texto.
            val etNombre = etName.text.toString()
            //añadimos la información necesaria al intent
            intent.putExtra("NAME", etNombre)

            //iniciar la nueva actividad
            startActivity(intent)
        }

    }

    companion object {
        const val NAME = "NAME"
    }
}