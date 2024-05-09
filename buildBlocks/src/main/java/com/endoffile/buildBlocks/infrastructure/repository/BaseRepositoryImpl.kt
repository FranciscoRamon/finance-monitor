package com.endoffile.buildBlocks.infrastructure.repository

import com.endoffile.buildBlocks.domain.BaseRepository
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import jakarta.transaction.Transactional
import kotlin.reflect.KClass

abstract class BaseRepositoryImpl<T : Any, ID>(
    private val entityClass: KClass<T>,
) : BaseRepository<T, ID> {

    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Transactional
    override fun save(entity: T): T {
        entityManager.persist(entity)
        return entity
    }

    override fun findById(id: ID): T? {
        return entityManager.find(entityClass.java, id)
    }

    override fun findAll(): Result<List<T>> {
        return try {
            val query = entityManager.createQuery("SELECT e FROM ${entityClass.simpleName} e", entityClass.java)
            Result.success(query.resultList)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    @Transactional
    override fun delete(entity: T) {
        entityManager.remove(entity)
    }
}