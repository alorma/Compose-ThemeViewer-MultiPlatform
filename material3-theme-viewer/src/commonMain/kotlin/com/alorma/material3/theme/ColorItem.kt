package com.alorma.material3.theme

import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
internal fun ColorItem(
  containerColor: Color,
  contentColor: Color = Color.Unspecified,
  showBorder: Boolean = false,
  containerText: String,
) {
  ColorCard(
    containerColor = containerColor,
    contentColor = if (contentColor == Color.Unspecified) {
      contentColorFor(containerColor)
    } else {
      contentColor
    },
    containerText = containerText,
    showBorder = showBorder,
  )
}