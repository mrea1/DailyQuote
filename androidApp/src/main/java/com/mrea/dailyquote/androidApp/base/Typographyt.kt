package com.mrea.dailyquote.androidApp.base

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mrea.dailyquote.androidApp.R

val Poppins = FontFamily(
    Font(R.font.poppins),
    Font(R.font.poppins, FontWeight.W500),
    Font(R.font.rubik_bold, FontWeight.Bold)
)

val typography = Typography(
    h1 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W300,
        fontSize = 96.sp
    ),
    body1 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    body2 = TextStyle(

    ),
    h2 = TextStyle(),
    h3 =,
    h4 =,
    h5 =,
    h6 =,
    subtitle1 =,
    subtitle2 =,
    button =,
    caption =,
    overline =,
    defaultFontFamily =,
)
