package com.example.appgym

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.util.Locale

class FragmentTextFields : Fragment(R.layout.fragment_textfields) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etNombre = view.findViewById<EditText>(R.id.etNombre)
        val etEdad = view.findViewById<EditText>(R.id.etEdad)
        val etPais = view.findViewById<EditText>(R.id.etPais)
        val etTelefono = view.findViewById<EditText>(R.id.etTelefono)
        val etPeso = view.findViewById<EditText>(R.id.etPeso)
        val etAltura = view.findViewById<EditText>(R.id.etAltura)
        val etMotivacion = view.findViewById<EditText>(R.id.etMotivacion)
        val btnMostrarInfoUsuario = view.findViewById<Button>(R.id.btnMostrarInfoUsuario)
        val tvResultadoPerfil = view.findViewById<TextView>(R.id.tvResultadoPerfil)

        btnMostrarInfoUsuario.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val edad = etEdad.text.toString().trim()
            val pais = etPais.text.toString().trim()
            val telefono = etTelefono.text.toString().trim()
            val pesoTexto = etPeso.text.toString().trim()
            val alturaTexto = etAltura.text.toString().trim()
            val motivacion = etMotivacion.text.toString().trim()

            if (nombre.isEmpty() || edad.isEmpty() || pesoTexto.isEmpty() || alturaTexto.isEmpty()) {
                Toast.makeText(
                    requireContext(),
                    "Completa nombre, edad, peso y altura",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val peso = pesoTexto.toDoubleOrNull()
            val altura = alturaTexto.toDoubleOrNull()

            if (peso == null || altura == null || altura <= 0.0) {
                Toast.makeText(
                    requireContext(),
                    "Ingresa peso y altura válidos",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val imc = peso / (altura * altura)
            val imcFormateado = String.format(Locale.US, "%.2f", imc)

            tvResultadoPerfil.text = """
                Nombre: $nombre
                Edad: $edad
                País: $pais
                Teléfono: $telefono
                Peso: $pesoTexto kg
                Altura: $alturaTexto m
                IMC: $imcFormateado
                Motivación: $motivacion
            """.trimIndent()
        }
        val btnSiguientePerfil = view.findViewById<Button>(R.id.btnSiguientePerfil)

        btnSiguientePerfil.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_seleccion)
        }
    }
}