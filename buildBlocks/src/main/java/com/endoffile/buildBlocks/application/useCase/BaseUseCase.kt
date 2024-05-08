package com.endoffile.buildBlocks.application.useCase

interface UseCase<Request, Response> {
    fun execute(request: Request? = null): Response
}