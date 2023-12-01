package com.alorma.material3.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class ThemeViewerScope(
  private val lazyListScope: LazyListScope,
) {

  @OptIn(ExperimentalFoundationApi::class)
  fun header(
    key: Any? = null,
    content: @Composable () -> Unit = {},
  ) = lazyListScope.stickyHeader(key) {
    HeaderItem(content)
  }

  @OptIn(ExperimentalFoundationApi::class)
  fun subHeader(
    key: Any? = null,
    content: @Composable () -> Unit,
  ) = lazyListScope.stickyHeader(key) {
    SubHeaderItem(content)
  }

  fun color(
    key: Any? = null,
    containerColor: Color,
    contentColor: Color = Color.Unspecified,
    containerText: String,
    showBorder: Boolean = false,
  ) = lazyListScope.item(key) {
    ColorItem(
      containerColor = containerColor,
      contentColor = contentColor,
      showBorder = showBorder,
      containerText = containerText,
    )
  }
}