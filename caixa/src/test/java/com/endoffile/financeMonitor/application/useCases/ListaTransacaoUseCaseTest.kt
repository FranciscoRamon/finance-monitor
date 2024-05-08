package com.endoffile.financeMonitor.application.useCases

import com.endoffile.financeMonitor.domain.repository.TransacaoRepository
import com.endoffile.financeMonitor.spawner.TransacaoSpawner
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class ListaTransacaoUseCaseTest {

    private val transacaoRepository: TransacaoRepository = Mockito.mock(TransacaoRepository::class.java)
    private val listaTransacaoUseCase = ListaTransacaoUseCase(transacaoRepository)

    @Test
    fun `execute returns list of transactions when repository returns successfully`() {
        val expectedTransactions = TransacaoSpawner().spawn()
        `when`(transacaoRepository.findAll()).thenReturn(Result.success(expectedTransactions))

        val actualTransactions = listaTransacaoUseCase.execute(Unit)

        assertEquals(expectedTransactions, actualTransactions)
    }

    @Test
    fun `execute throws exception when repository fails`() {
        val exception = RuntimeException("Error")
        `when`(transacaoRepository.findAll()).thenReturn(Result.failure(exception))

        assertThrows<RuntimeException> {
            listaTransacaoUseCase.execute(Unit)
        }
    }
}