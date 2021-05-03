package com.brq.projetobrq.model

class Carro(
        val nome: String,
        val ano: String,
        val cor: String,
) {
    fun acelerar(){
        println("$nome acelerando...")
    }

}