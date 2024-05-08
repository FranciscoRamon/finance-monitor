package com.endoffile.financeMonitor.spawner

import com.endoffile.financeMonitor.domain.Pessoa
import java.util.*

class PessoaSpawner {

    fun spawn(): Pessoa {
        val nome = "Joe Doe"
        val email = "joedoe@email.com"

        return Pessoa(
            pessoaId = UUID.randomUUID(),
            nome = nome,
            email = email
        )
    }
}