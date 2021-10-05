package com.example.pmm_42funcionesnumerovariabledeparametros_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_42funcionesnumerovariabledeparametros_serranocanoruben_as.databinding.ActivityProblema3PropuestoBinding

class Problema3Propuesto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3_propuesto)

        val binding = ActivityProblema3PropuestoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultado = "El total de mayores de edad es: ${contadorMayores(17,20,21,23,17)}"

        binding.tvResultado30.text = resultado

    }
    fun contadorMayores(vararg listaEdades:Int):Int{
        var contador = 0
        for (edad in listaEdades)
            if (edad >= 18)
                contador++
        return contador
    }
}