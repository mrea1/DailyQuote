package com.mrea.dailyquote.shared

import kotlinx.coroutines.delay

class QuoteRepository {

    suspend fun getQuotes(): List<Quote> {
        delay(2000)
        return List(5) { index ->
            Quote(
                text = "Test $index",
                textColor = "#000000",
                backgroundColor = "#FFFFFF"
            )
        }
    }

}

data class Quote(
    val text: String,
    val textColor: String,
    val backgroundColor: String,
)