package com.alorma.material3.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun HeaderItem(text: @Composable () -> Unit) {
  Surface(
    modifier = Modifier.height(48.dp).fillMaxWidth(),
  ) {
    Box(
      contentAlignment = Alignment.CenterStart
    ) {
      ProvideTextStyle(MaterialTheme.typography.titleMedium) {
        text()
      }
    }
  }
}