package com.example.my_exam.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.my_exam.dao.CategoryDao
import com.example.my_exam.dao.PaymentsDao
import com.example.my_exam.dao.ServicesDao
import com.example.my_exam.entities.Category
import com.example.my_exam.entities.Payments
import com.example.my_exam.entities.Services

@Database(entities = [Services::class, Category::class, Payments::class], version = 4, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun CategoryDao(): CategoryDao
    abstract fun ServicesDao(): ServicesDao
    abstract fun PaymentsDao(): PaymentsDao
}