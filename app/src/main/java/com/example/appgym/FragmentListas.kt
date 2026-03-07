package com.example.appgym

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentListas : Fragment(R.layout.fragment_listas) {

    private val ejercicios = listOf(
        "Calentamiento",
        "Serie 1",
        "Serie 2",
        "Serie 3",
        "Estiramiento final"
    )

    private var indiceActual = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvEjercicioActual = view.findViewById<TextView>(R.id.tvEjercicioActual)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBarRutina)
        val tvProgreso = view.findViewById<TextView>(R.id.tvProgreso)
        val btnCompletarEjercicio = view.findViewById<Button>(R.id.btnCompletarEjercicio)
        val tvEstadoRutina = view.findViewById<TextView>(R.id.tvEstadoRutina)

        val btnAtrasProgreso = view.findViewById<Button>(R.id.btnAtrasProgreso)
        val btnSiguienteProgreso = view.findViewById<Button>(R.id.btnSiguienteProgreso)

        fun actualizarVista() {
            val progreso = (indiceActual * 100) / ejercicios.size
            progressBar.progress = progreso
            tvProgreso.text = "Progreso actual: $progreso%"

            if (indiceActual < ejercicios.size) {
                tvEjercicioActual.text = "Ejercicio actual: ${ejercicios[indiceActual]}"
                tvEstadoRutina.text = "Estado: rutina en progreso"
            } else {
                tvEjercicioActual.text = "Ejercicio actual: Rutina completada"
                tvEstadoRutina.text = "Estado: rutina terminada"
                progressBar.progress = 100
                tvProgreso.text = "Progreso actual: 100%"
            }
        }

        actualizarVista()

        btnCompletarEjercicio.setOnClickListener {
            if (indiceActual < ejercicios.size) {
                indiceActual++
                actualizarVista()

                if (indiceActual == ejercicios.size) {
                    Toast.makeText(
                        requireContext(),
                        "¡Rutina terminada!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                Toast.makeText(
                    requireContext(),
                    "La rutina ya fue completada",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        btnAtrasProgreso.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_botones)
        }

        btnSiguienteProgreso.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_info)
        }
    }
}