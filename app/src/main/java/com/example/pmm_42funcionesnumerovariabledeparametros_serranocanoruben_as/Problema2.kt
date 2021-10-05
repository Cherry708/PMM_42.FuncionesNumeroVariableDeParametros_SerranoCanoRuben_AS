package com.example.pmm_42funcionesnumerovariabledeparametros_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_42funcionesnumerovariabledeparametros_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultado = "Suma de 5,5,5,2: "+operar(Operacion.SUMA,5,5,5,2)
        binding.tvResultado20.text = resultado

    }
}

enum class Operacion{
    SUMA,
    PROMEDIO
}
fun operar(operacion: Operacion, vararg listaEnteros: Int): Int {
    return when (operacion) {
        Operacion.SUMA -> listaEnteros.sum()
        Operacion.PROMEDIO -> listaEnteros.average().toInt()
    }
}