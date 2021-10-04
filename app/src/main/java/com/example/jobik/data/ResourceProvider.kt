package com.example.jobik.data

import android.content.Context

import androidx.core.content.ContextCompat

class ResourceProvider(private val context: Context) {
    fun getColor(resId: Int) = ContextCompat.getColor(context, resId)
    fun getString(id: Int) =context.getString(id)
}