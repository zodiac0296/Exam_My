package com.example.my_exam.dao

import androidx.room.*
import com.example.my_exam.entities.Category

@Dao
interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addCategory(vararg category: Category)

    @Query("SELECT * FROM Category")
    fun getAllCategory(): Array<Category>

    @Query("SELECT nameCategory FROM Category")
    fun getNameCategory(): List<String>

    @Delete
    fun deleteCategory(category: Category)
}