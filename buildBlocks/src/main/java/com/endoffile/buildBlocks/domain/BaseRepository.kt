package com.endoffile.buildBlocks.domain


interface BaseRepository<T, ID> {
    fun save(entity: T): T
    fun findById(id: ID): T?
    fun findAll(): Result<List<T>>
    fun delete(entity: T)
}