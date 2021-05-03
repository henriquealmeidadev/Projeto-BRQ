package com.brq.projetobrq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.brq.projetobrq.R
import com.google.android.material.snackbar.Snackbar

class LoginActivity() : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var tituloView: TextView
    lateinit var editTextEmail: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        carregarElementos()
        carregarEventos()

    }

    private fun carregarElementos() {
        btnLogin = findViewById()
        tituloView = findViewById()
        editTextEmail = findViewById()


    }

    private fun carregarEventos() {
        btnLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
        }


    }
}

    override fun onStart() {
        super.onStart()
        println("-----ON START")
    }

    override fun onResume() {
        super.onResume()
        println("-----ON RESUME")
    }

    override fun onRestart() {
        super.onRestart()
        println("-----ON RESTART")
    }

    override fun onStop() {
        super.onStop()
        println("-----ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("-----ON DESTROY")
    }


}



