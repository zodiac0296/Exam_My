package com.example.my_exam.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.my_exam.entities.Payments

@Dao
interface PaymentsDao {
    @Insert
    fun addPayments(payments: Payments)

    @Query("SELECT * FROM Payments")
    fun getAllPayments(): Array<Payments>

    @Delete
    fun delPayment(payment: Payments)
}