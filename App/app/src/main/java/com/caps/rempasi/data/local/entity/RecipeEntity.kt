package com.caps.rempasi.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe")
data class RecipeEntity(
    @PrimaryKey
    val id: Int,
    val imageUrl: String,
    val recipe_name: String,
    val steps: List<String>,
    val ingredients: List<String>,
    val isSaved: Boolean? = false,
)
