package com.example.vknews.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Black900,
    surfaceVariant = Black900,
    secondary = Black900,
    onPrimary = Color.White,
    onSecondary = Black500
)

private val LightColorScheme = lightColorScheme(
    primary = Color.White,
    surfaceVariant = Color.White,
    secondary = Color.White,
    onPrimary = Black900,
    onSecondary = Black500
)

@Composable
fun VkNewsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(

        colorScheme = colors,
        typography = Typography,
        content = content,
        shapes = Shapes
    )
}