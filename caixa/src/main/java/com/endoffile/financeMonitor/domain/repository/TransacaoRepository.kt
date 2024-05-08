package com.endoffile.financeMonitor.domain.repository

import com.endoffile.buildBlocks.domain.BaseRepository
import com.endoffile.financeMonitor.domain.Transacao
import java.util.*

interface TransacaoRepository : BaseRepository<Transacao, UUID>