package com.endoffile.financeMonitor.application.useCases

import com.endoffile.buildBlocks.application.useCase.UseCase
import com.endoffile.financeMonitor.domain.Transacao
import com.endoffile.financeMonitor.domain.repository.TransacaoRepository
import jakarta.enterprise.context.ApplicationScoped
import java.util.logging.Logger

@ApplicationScoped
class ListaTransacaoUseCase(
    private val transacaoRepository: TransacaoRepository
) : UseCase<Unit, List<Transacao>> {

    private val logger: Logger = Logger.getLogger(ListaTransacaoUseCase::class.java.toString())

    override fun execute(request: Unit?): List<Transacao> = this.transacaoRepository.findAll().fold(
        onSuccess = { return it },
        onFailure = {
            logger.severe("Erro ao listar transações: ${it.message}")
            throw it
        }
    )
}