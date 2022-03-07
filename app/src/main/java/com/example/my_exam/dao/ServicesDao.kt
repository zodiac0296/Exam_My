package com.example.my_exam.dao

import androidx.room.*
import com.example.my_exam.entities.Services

@Dao
interface ServicesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addServices(vararg services: Services)

    @Query("SELECT * FROM Services")
    fun getAllServices(): Array<Services>

    @Delete
    fun deleteServices(services: Services)
}