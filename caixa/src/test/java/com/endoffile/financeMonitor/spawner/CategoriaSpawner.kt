package com.endoffile.financeMonitor.spawner

import com.endoffile.financeMonitor.domain.Categoria
import java.util.*

class CategoriaSpawner {

    fun spawn(): Categoria {
        val descricao = "Descricao ficticia"

        return Categoria(
            categoriaId = UUID.randomUUID(),
            descricao = descricao
        )
    }
}