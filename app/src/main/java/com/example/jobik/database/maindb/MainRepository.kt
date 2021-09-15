package com.example.jobik.database.maindb

interface MainRepository {
    suspend fun getAll(): List<MainAdd>
    suspend fun insert(mainAdd: MainAdd)
    suspend fun insertList(mainAdd: List<MainAdd>)
    suspend fun getById(id: Long): MainAdd
    suspend fun update(mainAdd: MainAdd)
    suspend fun delete(mainAdd: MainAdd)
}