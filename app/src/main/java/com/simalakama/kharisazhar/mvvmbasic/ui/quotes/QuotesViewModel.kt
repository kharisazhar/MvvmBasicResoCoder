package com.simalakama.kharisazhar.mvvmbasic.ui.quotes

import androidx.lifecycle.ViewModel
import com.simalakama.kharisazhar.mvvmbasic.data.Quote
import com.simalakama.kharisazhar.mvvmbasic.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}