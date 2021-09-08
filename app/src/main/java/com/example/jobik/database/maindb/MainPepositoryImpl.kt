package com.example.jobik.database.maindb

import com.example.jobik.database.workplace.AppDatabase

class MainPepositoryImpl(private val appMainDatabase: AppMainDatabase) : MainPepository {
    override suspend fun getAll(): List<MainAdd> = appMainDatabase.mainDao().all()
    override suspend fun insert(mainAdd: MainAdd) = appMainDatabase.mainDao().insert(mainAdd)

    override suspend fun getById(id: Long): MainAdd = appMainDatabase.mainDao().getByID(id)

    override suspend fun update(mainAdd: MainAdd) = appMainDatabase.mainDao().update(mainAdd)

    override suspend fun delete(mainAdd: MainAdd) = appMainDatabase.mainDao().delete(mainAdd)
}