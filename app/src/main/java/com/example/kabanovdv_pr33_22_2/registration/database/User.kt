package com.example.kabanovdv_pr33_22_2.registration.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val username: String,
    val password: String
)