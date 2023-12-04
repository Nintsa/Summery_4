package com.example.assignment13.model

data class ItemClass(
    val hint: String,
    val id: Int,
    val fieldType: String,
    val keyboard: String,
    var required: Boolean,
    val isActive: Boolean,
    val icon: Int
)
