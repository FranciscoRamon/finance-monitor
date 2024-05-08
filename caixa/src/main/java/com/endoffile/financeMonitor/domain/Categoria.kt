package com.endoffile.financeMonitor.domain

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "categorias")
data class Categoria(
    @Id
    @GeneratedValue
    @Column(name = "categoria_id")
    val categoriaId: UUID,

    @Column(nullable = false)
    val descricao: String
)