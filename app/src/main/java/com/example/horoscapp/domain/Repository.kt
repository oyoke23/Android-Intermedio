package com.example.horoscapp.domain

import com.example.horoscapp.domain.model.PredictionModel

fun interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}