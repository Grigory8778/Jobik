package com.example.jobik.database.maindb

import com.example.jobik.database.workplace.AppDatabase

class MainRepositoryImpl(private val appDatabase: AppDatabase) : MainRepository {
    override suspend fun getAll(): List<MainAdd> = appDatabase.mainDao().all()
    override suspend fun insert(mainAdd: MainAdd) = appDatabase.mainDao().insert(mainAdd)
    override suspend fun insertList(mainAdd: List<MainAdd>) = appDatabase.mainDao().insertList(mainAdd)
    override suspend fun getById(id: Long): MainAdd = appDatabase.mainDao().getByID(id)
    override suspend fun update(mainAdd: MainAdd) = appDatabase.mainDao().update(mainAdd)
    override suspend fun delete(mainAdd: MainAdd) = appDatabase.mainDao().delete(mainAdd)
}