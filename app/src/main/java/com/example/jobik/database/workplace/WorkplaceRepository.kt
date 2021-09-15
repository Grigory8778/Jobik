package com.example.jobik.database.workplace

interface WorkplaceRepository {
    suspend fun getAll(): List<Workplace>
    suspend fun insert(workplace: Workplace):Long
    suspend fun getById(id: Long): Workplace
    suspend fun update(workplace: Workplace)
    suspend fun delete(workplace: Workplace)
}