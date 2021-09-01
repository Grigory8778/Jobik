package com.example.jobik.data

import android.content.SharedPreferences

class TimeRepositoryImpl(private val sharedPreferences: SharedPreferences) : TimeRepository {
    override fun saveStatus(status: Boolean) {
        sharedPreferences.edit().putBoolean(KAY_STATUS, status).apply()
    }

    override fun getStatus(): Boolean {
        return sharedPreferences.getBoolean(KAY_STATUS, true)
    }

    override fun saveMin(min: Int) {
        sharedPreferences.edit().putInt(TIME_MIN, min).apply()
    }

    override fun saveHour(hour: Int) {
        sharedPreferences.edit().putInt(TIME_MIN, hour).apply()
    }

    override fun getMin(): Int {
        return  sharedPreferences.getInt(TIME_MIN, 30)
    }

    override fun getHour(): Int {
        return  sharedPreferences.getInt(TIME_HOUR, 30)
    }



    companion object {
        private const val KAY_STATUS: String = "KAY_STATUS"
        private const val TIME_MIN: String = "timemin"
        private const val TIME_HOUR: String = "timehour"
    }
}