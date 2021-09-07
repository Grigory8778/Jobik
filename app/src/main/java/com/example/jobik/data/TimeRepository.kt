package com.example.jobik.data

interface TimeRepository {
    fun saveStatus(status: Boolean)
    fun getStatus(): Boolean
    fun saveMin(min: Int)
    fun saveHour(hour: Int)
    fun getMin(): Int
    fun getHour(): Int
}