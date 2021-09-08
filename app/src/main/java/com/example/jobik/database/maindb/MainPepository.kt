package com.example.jobik.database.maindb

import com.example.jobik.database.workplace.Workplace

interface MainPepository {
    suspend fun getAll(): List<MainAdd>
    suspend fun insert(mainAdd: MainAdd)
    suspend fun getById(id: Long): MainAdd
    suspend fun update(mainAdd: MainAdd)
    suspend fun delete(mainAdd: MainAdd)
}