package com.alorma.material3.theme.sample

import ThemeViewer
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun App(
  colorScheme: ColorScheme = if (isSystemInDarkTheme()) {
    darkColorScheme()
  } else {
    lightColorScheme()
  },
) {
  MaterialTheme(
    colorScheme = colorScheme,
  ) {
    Scaffold(
      topBar = { TopAppBar(title = { Text(text = "Desktop demo") }) },
    ) { padding ->
      ThemeViewer(
        modifier = Modifier
          .consumeWindowInsets(padding)
          .padding(top = padding.calculateTopPadding())
          .fillMaxSize(),
      )
    }
  }
}