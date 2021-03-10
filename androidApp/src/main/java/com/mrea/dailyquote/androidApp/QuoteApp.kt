package com.mrea.dailyquote.androidApp

import android.app.Application
import com.mrea.dailyquote.shared.initKoin

class QuoteApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            modules(appModule)
        }
    }
}