package com.example.appgym

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSeleccion : Fragment(R.layout.fragment_seleccion) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cbPecho = view.findViewById<CheckBox>(R.id.cbPecho)
        val cbPierna = view.findViewById<CheckBox>(R.id.cbPierna)
        val cbEspalda = view.findViewById<CheckBox>(R.id.cbEspalda)
        val cbAbdomen = view.findViewById<CheckBox>(R.id.cbAbdomen)
        val cbGluteo = view.findViewById<CheckBox>(R.id.cbGluteo)

        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroupNivel)
        val switchNotif = view.findViewById<Switch>(R.id.switchNotificaciones)
        val btnGuardarSeleccion = view.findViewById<Button>(R.id.btnGuardarSeleccion)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultadoSeleccion)

        btnGuardarSeleccion.setOnClickListener {
            val partes = mutableListOf<String>()

            if (cbPecho.isChecked) partes.add("Pecho")
            if (cbPierna.isChecked) partes.add("Pierna")
            if (cbEspalda.isChecked) partes.add("Espalda")
            if (cbAbdomen.isChecked) partes.add("Abdomen")
            if (cbGluteo.isChecked) partes.add("Glúteo")

            val radioSeleccionadoId = radioGroup.checkedRadioButtonId
            val nivel = if (radioSeleccionadoId != -1) {
                val radioSeleccionado = view.findViewById<RadioButton>(radioSeleccionadoId)
                radioSeleccionado.text.toString()
            } else {
                "No seleccionado"
            }

            val recordatorios = if (switchNotif.isChecked) "Activados" else "Desactivados"
            val partesTexto = if (partes.isNotEmpty()) partes.joinToString(", ") else "Ninguna"

            tvResultado.text = "Partes del cuerpo: $partesTexto\nNivel: $nivel\nRecordatorios: $recordatorios"
        }

        val btnAtrasSeleccion = view.findViewById<Button>(R.id.btnAtrasSeleccion)
        val btnSiguienteSeleccion = view.findViewById<Button>(R.id.btnSiguienteSeleccion)

        btnAtrasSeleccion.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_textfields)
        }

        btnSiguienteSeleccion.setOnClickListener {
            (activity as? MainActivity)?.navigateToFragment(R.id.nav_botones)
        }
    }
}