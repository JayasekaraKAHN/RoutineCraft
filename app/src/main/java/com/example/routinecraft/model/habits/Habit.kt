package com.example.routinecraft.model.habits

import java.time.LocalTime

data class Habit(
    val id: Long,
    var name: String,
    val startTime: LocalTime? = null
)