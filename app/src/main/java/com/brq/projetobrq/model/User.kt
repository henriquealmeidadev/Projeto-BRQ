package com.brq.projetobrq.model

class User(
        val email: String,
        val senha: String,
) {

    fun validarEmail(): Boolean{
        return email !=""
    }

    fun validarSenha(): Boolean{
        return senha != "" && senha.lenght
    }

    override fun toString(): String {
        return super.toString()
    }
}