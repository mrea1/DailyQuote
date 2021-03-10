package com.mrea.dailyquote.androidApp.quote

import androidx.compose.ui.graphics.Color
import com.mrea.dailyquote.androidApp.base.BaseViewModel
import com.mrea.dailyquote.androidApp.base.getData
import com.mrea.dailyquote.androidApp.utils.fromHex
import com.mrea.dailyquote.shared.QuoteRepository
import kotlinx.coroutines.flow.MutableStateFlow

class QuoteViewModel(private val repository: QuoteRepository) : BaseViewModel<QuoteUiState>() {

    override val stateFlow: MutableStateFlow<QuoteUiState> = MutableStateFlow(QuoteUiState())

    init {
        getData()
    }

    fun onClick() {
        getData()
    }

    private fun getData() {
        updateUiState(QuoteUiState(isLoading = true))

        getData {
            val quote = repository.getQuotes().random()
            updateUiState(
                QuoteUiState(
                    isLoading = false,
                    text = quote.text,
                    textColor = Color.fromHex(quote.textColor),
                    backgroundColor = Color.fromHex(quote.backgroundColor),
                )
            )
        }
    }
}