package com.endoffile.financeMonitor.presentation.rest

import com.endoffile.financeMonitor.application.useCases.ListaTransacaoUseCase
import com.endoffile.financeMonitor.domain.Transacao
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/transacoes")
class TransacaoResource(
    @Inject
    private var listaTransacaoUseCase: ListaTransacaoUseCase
) {

    @GET
    fun listarTodos(): List<Transacao> {
        return this.listaTransacaoUseCase.execute()
    }

}