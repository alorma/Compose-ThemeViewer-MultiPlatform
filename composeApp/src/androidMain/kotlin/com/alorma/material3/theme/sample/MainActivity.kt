package com.alorma.material3.theme.sample

import ThemeViewer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
  @OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MaterialTheme(
        colorScheme = dynamicLightColorScheme(LocalContext.current)
      ) {
        Scaffold(
          topBar = { TopAppBar(title = { Text(text = "Desktop demp") }) },
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
  }
}