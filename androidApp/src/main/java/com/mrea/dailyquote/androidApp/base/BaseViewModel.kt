package com.mrea.dailyquote.androidApp.base

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

abstract class BaseViewModel<UiStateType: UiState> : ViewModel() {

    abstract val stateFlow: StateFlow<UiStateType>

    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        Log.e("BaseViewModel", "$exception")
    }

    fun updateUiState(uiStateType: UiStateType) {
        (stateFlow as MutableStateFlow).value = uiStateType
    }
}

fun <T> BaseViewModel<*>.getData(block: suspend () -> T) {
    viewModelScope.launch(exceptionHandler) {
        withContext(Dispatchers.IO) {
            block()
        }
    }
}