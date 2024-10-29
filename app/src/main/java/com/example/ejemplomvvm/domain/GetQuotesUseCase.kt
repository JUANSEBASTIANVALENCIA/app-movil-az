package com.example.ejemplomvvm.domain

import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.repositories.QuoteRepository

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuotes()

}