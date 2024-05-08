package com.endoffile.financeMonitor.presentation.rest

import com.endoffile.financeMonitor.domain.Pessoa
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/pessoas")
class PessoaResource {

    @GET
    fun listar(): List<Pessoa>? {
        return null
    }

}