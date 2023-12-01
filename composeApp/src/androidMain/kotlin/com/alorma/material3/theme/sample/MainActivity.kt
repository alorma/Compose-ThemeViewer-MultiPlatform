package com.alorma.material3.theme.sample

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.alorma.material3.theme.sample.theme.AppTheme

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val colorScheme = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        dynamicColorScheme()
      } else {
        colorScheme()
      }
      AppTheme(colorScheme = colorScheme) {
        App()
      }
    }
  }

  @Composable
  private fun colorScheme() = if (isSystemInDarkTheme()) {
    darkColorScheme()
  } else {
    lightColorScheme()
  }

  @RequiresApi(Build.VERSION_CODES.S)
  @Composable
  private fun dynamicColorScheme() = if (isSystemInDarkTheme()) {
    dynamicDarkColorScheme(LocalContext.current)
  } else {
    dynamicLightColorScheme(LocalContext.current)
  }
}