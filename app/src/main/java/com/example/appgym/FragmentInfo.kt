package com.example.appgym

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentInfo : Fragment(R.layout.fragment_info) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvResumenFinal = view.findViewById<TextView>(R.id.tvResumenFinal)
        val btnVolverInicio = view.findViewById<Button>(R.id.btnVolverInicio)

        tvResumenFinal.text = """
            Perfil del usuario capturado correctamente.
            Selección de partes del cuerpo realizada.
            Ejercicios recomendados revisados.
            Progreso de rutina registrado.
            Estado final: entrenamiento listo para repetirse o mejorarse.
        """.trimIndent()

        btnVolverInicio.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_textfields)
        }
    }
}