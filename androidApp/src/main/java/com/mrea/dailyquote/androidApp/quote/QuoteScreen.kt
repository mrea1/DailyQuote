package com.mrea.dailyquote.androidApp.quote

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.getViewModel

@Composable
fun QuoteScreen() {
    val viewModel = getViewModel<QuoteViewModel>()
    val uiState: QuoteUiState = viewModel.stateFlow.collectAsState().value

    Box(modifier = Modifier.fillMaxSize().background(uiState.backgroundColor).clickable(onClick = viewModel::onClick)) {
        if (uiState.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center).size(80.dp))
        } else {
            Text(
                text = uiState.text,
                modifier = Modifier.align(Alignment.Center),
                color = uiState.textColor,
            )
        }
    }
}