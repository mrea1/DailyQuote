package com.mrea.dailyquote.androidApp

import com.mrea.dailyquote.androidApp.quote.QuoteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { QuoteViewModel(get()) }

}