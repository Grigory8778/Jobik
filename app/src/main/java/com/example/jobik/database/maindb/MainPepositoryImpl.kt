package com.example.jobik.database.maindb

class MainPepositoryImpl(private val appMainDatabase: AppMainDatabase) : MainPepository {
    override suspend fun getAll(): List<MainAdd> = appMainDatabase.mainDao().all()
    override suspend fun insert(mainAdd: MainAdd) = appMainDatabase.mainDao().insert(mainAdd)
    override suspend fun insertList(mainAdd: List<MainAdd>){}
    override suspend fun getById(id: Long): MainAdd = appMainDatabase.mainDao().getByID(id)
    override suspend fun update(mainAdd: MainAdd) = appMainDatabase.mainDao().update(mainAdd)
    override suspend fun delete(mainAdd: MainAdd) = appMainDatabase.mainDao().delete(mainAdd)
}