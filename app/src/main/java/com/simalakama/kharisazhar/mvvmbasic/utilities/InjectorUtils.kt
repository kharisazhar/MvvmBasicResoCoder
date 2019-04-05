package com.simalakama.kharisazhar.mvvmbasic.utilities

import com.simalakama.kharisazhar.mvvmbasic.data.FakeDatabase
import com.simalakama.kharisazhar.mvvmbasic.data.QuoteRepository
import com.simalakama.kharisazhar.mvvmbasic.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository =  QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}