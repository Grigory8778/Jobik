package com.example.jobik.database

class DatabaseRepositoryImpl(private val appDatabase: AppDatabase) : DatabaseRepository {
    override suspend fun getAll(): List<Workplace> = appDatabase.weatherDao().all()

    override suspend fun insert(workplace: Workplace) = appDatabase.weatherDao().insert(workplace)

    override suspend fun getById(id: Long): Workplace = appDatabase.weatherDao().getByID(id)

    override suspend fun update(workplace: Workplace) = appDatabase.weatherDao().update(workplace)

    override suspend fun delete(workplace: Workplace) = appDatabase.weatherDao().delete(workplace)
}