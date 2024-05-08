package com.endoffile.financeMonitor.domain

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "pessoas")
data class Pessoa(
    @Id
    @GeneratedValue
    @Column(name = "pessoa_id")
    val pessoaId: UUID,

    @Column(nullable = false)
    val nome: String,

    val email: String?
)