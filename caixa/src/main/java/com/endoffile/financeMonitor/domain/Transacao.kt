package com.endoffile.financeMonitor.domain

import jakarta.persistence.*
import java.math.BigDecimal
import java.sql.Date
import java.util.*

@Entity
@Table(name = "transacoes")
data class Transacao(
    @Id
    @GeneratedValue
    @Column(name = "transacao_id")
    val transacaoId: UUID,

    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    val pessoa: Pessoa,

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    val categoria: Categoria,

    @Column(nullable = false)
    val descricao: String,

    @Column(nullable = false)
    val valor: BigDecimal,

    @Column(nullable = false, name = "data_transacao")
    val dataTransacao: Date,

    @Column(nullable = false)
    val tipo: Char,

    @Column(nullable = false, name = "status_pagamento")
    val statusPagamento: Char,

    @Column(nullable = false)
    val opcional: Boolean
)