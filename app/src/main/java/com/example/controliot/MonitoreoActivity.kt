package com.example.controliot

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MonitoreoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monitoreo)

        val tvEstadoConexion = findViewById<TextView>(R.id.tvEstadoConexion)
        val swMotor = findViewById<SwitchCompat>(R.id.swMotor)
        val btnConectar = findViewById<Button>(R.id.btnConectar)

        btnConectar.setOnClickListener {
            tvEstadoConexion.text = getString(R.string.estado_conectado)
            Toast.makeText(this, "Protocolo ISO 27001 iniciado", Toast.LENGTH_SHORT).show()
        }

        swMotor.setOnCheckedChangeListener { _, isChecked ->
            val comando = if (isChecked) "ON" else "OFF"
            Toast.makeText(this, "Comando $comando enviado", Toast.LENGTH_SHORT).show()
        }
    }
}