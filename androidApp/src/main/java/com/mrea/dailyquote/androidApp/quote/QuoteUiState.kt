package com.mrea.dailyquote.androidApp.quote

import androidx.compose.ui.graphics.Color
import com.mrea.dailyquote.androidApp.base.UiState

data class QuoteUiState(
    val isLoading: Boolean = false,
    val text: String = "",
    val textColor: Color = Color.Black,
    val backgroundColor: Color = Color.White,
): UiState