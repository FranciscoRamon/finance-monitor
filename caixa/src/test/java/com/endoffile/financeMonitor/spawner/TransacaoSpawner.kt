package com.endoffile.financeMonitor.spawner

import com.endoffile.financeMonitor.domain.Transacao
import java.math.BigDecimal
import java.sql.Date
import java.util.*

class TransacaoSpawner {

    fun spawn(): List<Transacao> {
        val pessoa = PessoaSpawner().spawn()
        val categoria = CategoriaSpawner().spawn()
        val descricao = "Descricao ficticia"
        val valor = BigDecimal.TEN
        val dataTransacao = Date(Calendar.getInstance().apply {
            set(2024, Calendar.JANUARY, 1)
        }.time.time)
        val opcional = false

        val tipos = listOf('E', 'S')
        val statusPagamentos = listOf('P', 'N')

        return tipos.flatMap { tipo ->
            statusPagamentos.map { statusPagamento ->
                Transacao(
                    transacaoId = UUID.randomUUID(),
                    pessoa = pessoa,
                    categoria = categoria,
                    descricao = descricao,
                    valor = valor,
                    dataTransacao = dataTransacao,
                    tipo = tipo,
                    statusPagamento = statusPagamento,
                    opcional = opcional
                )
            }
        }
    }
}