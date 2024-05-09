package com.endoffile.financeMonitor.infrastructure.repository

import com.endoffile.buildBlocks.infrastructure.repository.BaseRepositoryImpl
import com.endoffile.financeMonitor.domain.Transacao
import com.endoffile.financeMonitor.domain.repository.TransacaoRepository
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class TransacaoRepositoryImpl : BaseRepositoryImpl<Transacao, UUID>(
    Transacao::class
), TransacaoRepository