package com.alorma.material3.theme.sample.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalAppColorScheme = staticCompositionLocalOf<AppColorScheme> {
  error("No AppColors defined")
}

object AppTheme {
  val colorScheme: AppColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalAppColorScheme.current
}

@Composable
fun AppTheme(
  colorScheme: ColorScheme,
  content: @Composable () -> Unit,
) {
  MaterialTheme(colorScheme) {
    content()
  }
}