package com.example.jobik.database

interface DatabaseRepository {
    suspend fun getAll(): List<Workplace>
    suspend fun insert(workplace: Workplace)
    suspend fun getById(id: Long): Workplace
    suspend fun update(workplace: Workplace)
    suspend fun delete(workplace: Workplace)
}