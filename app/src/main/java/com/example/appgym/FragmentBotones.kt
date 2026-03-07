package com.example.appgym

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentBotones : Fragment(R.layout.fragment_botones) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPecho = view.findViewById<Button>(R.id.btnPecho)
        val btnPierna = view.findViewById<Button>(R.id.btnPierna)
        val btnEspalda = view.findViewById<Button>(R.id.btnEspalda)
        val btnAbdomen = view.findViewById<Button>(R.id.btnAbdomen)
        val btnGluteo = view.findViewById<Button>(R.id.btnGluteo)

        val tvRutinaActual = view.findViewById<TextView>(R.id.tvRutinaActual)
        val listViewRutina = view.findViewById<ListView>(R.id.listViewRutina)

        val btnAtrasEjercicios = view.findViewById<Button>(R.id.btnAtrasEjercicios)
        val btnSiguienteEjercicios = view.findViewById<Button>(R.id.btnSiguienteEjercicios)

        fun mostrarRutina(nombreRutina: String, ejercicios: List<String>) {
            tvRutinaActual.text = "Rutina seleccionada: $nombreRutina"

            val adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_list_item_1,
                ejercicios
            )
            listViewRutina.adapter = adapter

            Toast.makeText(
                requireContext(),
                "Mostrando ejercicios de $nombreRutina",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnPecho.setOnClickListener {
            mostrarRutina(
                "Pecho",
                listOf(
                    "Press de banca",
                    "Aperturas con mancuernas",
                    "Flexiones",
                    "Press inclinado"
                )
            )
        }

        btnPierna.setOnClickListener {
            mostrarRutina(
                "Pierna",
                listOf(
                    "Sentadillas",
                    "Desplantes",
                    "Prensa",
                    "Extensión de pierna"
                )
            )
        }

        btnEspalda.setOnClickListener {
            mostrarRutina(
                "Espalda",
                listOf(
                    "Jalón al pecho",
                    "Remo con barra",
                    "Peso muerto",
                    "Remo con mancuerna"
                )
            )
        }

        btnAbdomen.setOnClickListener {
            mostrarRutina(
                "Abdomen",
                listOf(
                    "Crunch",
                    "Plancha",
                    "Elevación de piernas",
                    "Russian twist"
                )
            )
        }

        btnGluteo.setOnClickListener {
            mostrarRutina(
                "Glúteo",
                listOf(
                    "Hip thrust",
                    "Patada de glúteo",
                    "Puente de glúteo",
                    "Sentadilla sumo"
                )
            )
        }

        listViewRutina.setOnItemClickListener { _, _, position, _ ->
            val ejercicio = listViewRutina.getItemAtPosition(position).toString()
            Toast.makeText(
                requireContext(),
                "Ejercicio seleccionado: $ejercicio",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnAtrasEjercicios.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_seleccion)
        }

        btnSiguienteEjercicios.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_listas)
        }
    }
}