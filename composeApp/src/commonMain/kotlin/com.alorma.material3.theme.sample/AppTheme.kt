package com.alorma.material3.theme.sample

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(
  colorScheme: ColorScheme,
  content: @Composable () -> Unit,
) {
  MaterialTheme(colorScheme) {
    content()
  }
}