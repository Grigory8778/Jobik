package com.example.jobik.database.maindb

import com.example.jobik.database.workplace.AppDatabase

class MainRepositoryImpl(private val appMainDatabase: AppDatabase) : MainRepository {
    override suspend fun getAll(): List<MainAdd> = appMainDatabase.mainDao().all()
    override suspend fun insert(mainAdd: MainAdd) = appMainDatabase.mainDao().insert(mainAdd)
    override suspend fun insertList(mainAdd: List<MainAdd>) = appMainDatabase.mainDao().insertList(mainAdd)
    override suspend fun getById(id: Long): MainAdd = appMainDatabase.mainDao().getByID(id)
    override suspend fun update(mainAdd: MainAdd) = appMainDatabase.mainDao().update(mainAdd)
    override suspend fun delete(mainAdd: MainAdd) = appMainDatabase.mainDao().delete(mainAdd)
}