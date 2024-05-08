package com.endoffile.financeMonitor.infrastructure.repository

import com.endoffile.buildBlocks.infrastructure.repository.BaseRepositoryImpl
import com.endoffile.financeMonitor.domain.Transacao
import com.endoffile.financeMonitor.domain.repository.TransacaoRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.persistence.EntityManager
import java.util.*

@ApplicationScoped
class TransacaoRepositoryImpl(entityManager: EntityManager) : BaseRepositoryImpl<Transacao, UUID>(
    Transacao::class,
    entityManager
), TransacaoRepository