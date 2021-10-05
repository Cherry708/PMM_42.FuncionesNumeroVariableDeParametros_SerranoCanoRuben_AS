package com.example.pmm_42funcionesnumerovariabledeparametros_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_42funcionesnumerovariabledeparametros_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultado = sumarEnteros(2,2,3,2,5)
        binding.tvResutlado10.text = resultado.toString()

    }
}
fun sumarEnteros(vararg listaEnteros:Int): Int {
    var suma = 0
    for(elemento in listaEnteros)
        suma += elemento
    return suma
}