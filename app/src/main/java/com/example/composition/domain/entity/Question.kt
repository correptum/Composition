package com.example.composition.domain.entity

data class Question(
    val sum: Int.Companion,
    val visibleNumber: Int,
    val options: List<Int>
)