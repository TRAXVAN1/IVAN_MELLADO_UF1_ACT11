package com.example.ivan_mellado_uf1_act11



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNom = findViewById<EditText>(R.id.etNom)
        val etCognom = findViewById<EditText>(R.id.etCognom)
        val etEdat = findViewById<EditText>(R.id.etEdat)
        val etTelefon = findViewById<EditText>(R.id.etTelefon)
        val etEmail = findViewById<EditText>(R.id.etEmail)

        val radioGroupGènere = findViewById<RadioGroup>(R.id.radioGroupGènere)

        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        btnEnviar.setOnClickListener {
            val nom = etNom.text.toString()
            val cognom = etCognom.text.toString()
            val edat = etEdat.text.toString()
            val telefon = etTelefon.text.toString()
            val email = etEmail.text.toString()
            val gènereId = radioGroupGènere.checkedRadioButtonId
            val gènere = if (gènereId != -1) {
                findViewById<RadioButton>(gènereId).text.toString()
            } else {
                "No especificat"
            }

            Toast.makeText(this, "Registre complet: $nom $cognom, $edat anys, $telefon, $email, gènere: $gènere", Toast.LENGTH_LONG).show()
        }

    }
}
