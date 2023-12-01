package com.alorma.material3.theme.sample

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.alorma.material3.theme.ThemeViewer
import com.alorma.material3.theme.sample.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun App() {
  Scaffold(
    topBar = { TopAppBar(title = { Text(text = "Theme Viewer (${Platform.name})") }) },
  ) { padding ->
    val colorScheme = AppTheme.colorScheme
    ThemeViewer(
      modifier = Modifier
        .consumeWindowInsets(padding)
        .padding(top = padding.calculateTopPadding())
        .fillMaxSize(),
    ) {
      header { Text(text = "Success color") }
      color(
        containerColor = colorScheme.success,
        contentColor = colorScheme.onSuccess,
        containerText = "success",
      )
      subHeader { Text(text = "onSuccess") }
      color(
        containerColor = colorScheme.onSuccess,
        contentColor = colorScheme.success,
        containerText = "onSuccess",
        showBorder = true,
      )
      header { Text(text = "Alert color") }
      color(
        containerColor = colorScheme.alert,
        contentColor = colorScheme.onAlert,
        containerText = "alert",
      )
      subHeader { Text(text = "onAlert") }
      color(
        containerColor = colorScheme.onAlert,
        contentColor = colorScheme.alert,
        containerText = "onAlert",
        showBorder = true,
      )
    }
  }
}