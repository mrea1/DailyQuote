package com.mrea.dailyquote.androidApp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mrea.dailyquote.androidApp.base.QuoteTheme
import com.mrea.dailyquote.androidApp.quote.QuoteScreen
import com.mrea.dailyquote.shared.Greeting


fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainLayout()
        }
    }
}

@Composable
fun MainLayout() {
    val navController = rememberNavController()

    QuoteTheme {
        NavHost(navController, startDestination = Screen.HelloScreen.title) {
            composable(Screen.HelloScreen.title) {
                QuoteScreen()
            }
        }
    }
}


sealed class Screen(val title: String) {
    object HelloScreen : Screen("HelloScreen")
}