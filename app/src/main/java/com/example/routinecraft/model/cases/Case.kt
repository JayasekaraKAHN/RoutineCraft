package com.example.routinecraft.model.cases

import com.example.routinecraft.view.adapters.ItemList



data class Case (
    val id: Long,
    var comment: String,
    var date: Long,
    val habitId: Long
) : ItemList