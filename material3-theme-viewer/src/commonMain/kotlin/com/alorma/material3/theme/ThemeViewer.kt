package com.alorma.material3.theme

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThemeViewer(
  modifier: Modifier = Modifier,
  customContent: ThemeViewerScope.() -> Unit = {},
) {
  val isDark = isSystemInDarkTheme()
  val colorScheme = MaterialTheme.colorScheme

  ThemeViewerColumn(
    modifier = modifier,
    contentPadding = PaddingValues(16.dp),
    verticalArrangement = Arrangement.spacedBy(12.dp),
  ) {
    header { Text(text = "Primary colors") }
    color(
      containerColor = colorScheme.primary,
      containerText = "primary",
    )
    color(
      containerColor = colorScheme.primaryContainer,
      containerText = "primaryContainer",
    )
    subHeader { Text(text = "onPrimary") }
    color(
      containerColor = colorScheme.onPrimary,
      contentColor = colorScheme.primary,
      showBorder = !isDark,
      containerText = "onPrimary",
    )
    color(
      containerColor = colorScheme.onPrimaryContainer,
      contentColor = colorScheme.primaryContainer,
      containerText = "onPrimaryContainer",
    )
    header { Text(text = "Secondary colors") }
    color(
      containerColor = colorScheme.secondary,
      containerText = "secondary",
    )
    color(
      containerColor = colorScheme.secondaryContainer,
      containerText = "secondaryContainer",
    )
    subHeader {
      Text(text = "onSecondary")
    }
    color(
      containerColor = colorScheme.onSecondary,
      contentColor = colorScheme.secondary,
      showBorder = !isDark,
      containerText = "onSecondary",
    )
    color(
      containerColor = colorScheme.onSecondaryContainer,
      contentColor = colorScheme.secondaryContainer,
      containerText = "onSecondaryContainer",
    )
    header { Text(text = "Tertiary colors ") }
    color(
      containerColor = colorScheme.tertiary,
      containerText = "tertiary",
    )
    color(
      containerColor = colorScheme.tertiaryContainer,
      containerText = "tertiaryContainer",
    )
    subHeader {
      Text(text = "onTertiary")
    }
    color(
      containerColor = colorScheme.onTertiary,
      contentColor = colorScheme.tertiary,
      showBorder = !isDark,
      containerText = "onTertiary",
    )
    color(
      containerColor = colorScheme.onTertiaryContainer,
      contentColor = colorScheme.tertiaryContainer,
      containerText = "onTertiaryContainer",
    )
    header { Text(text = "Error colors ") }
    color(
      containerColor = colorScheme.error,
      containerText = "error",
    )
    color(
      containerColor = colorScheme.errorContainer,
      containerText = "errorContainer",
    )
    subHeader { Text(text = "onError") }
    color(
      containerColor = colorScheme.onError,
      contentColor = colorScheme.error,
      showBorder = !isDark,
      containerText = "onError",
    )
    color(
      containerColor = colorScheme.onErrorContainer,
      contentColor = colorScheme.errorContainer,
      containerText = "onErrorContainer",
    )
    header { Text(text = "Surface colors") }
    color(
      containerColor = colorScheme.surface,
      containerText = "surface",
      showBorder = true,
    )
    color(
      containerColor = colorScheme.surfaceTint,
      containerText = "surfaceTint",
    )
    color(
      containerColor = colorScheme.surfaceVariant,
      containerText = "surfaceVariant",
      showBorder = isDark,
    )
    subHeader {
      Text(text = "onSurface")
    }
    color(
      containerColor = colorScheme.onSurface,
      contentColor = colorScheme.surface,
      showBorder = !isDark,
      containerText = "onSurface",
    )
    color(
      containerColor = colorScheme.onSurfaceVariant,
      contentColor = colorScheme.surfaceVariant,
      containerText = "onSurfaceVariant",
    )
    customContent()
  }
}

@Composable
private fun ThemeViewerColumn(
  modifier: Modifier = Modifier,
  state: LazyListState = rememberLazyListState(),
  contentPadding: PaddingValues = PaddingValues(0.dp),
  reverseLayout: Boolean = false,
  verticalArrangement: Arrangement.Vertical = if (!reverseLayout) {
    Arrangement.Top
  } else {
    Arrangement.Bottom
  },
  horizontalAlignment: Alignment.Horizontal = Alignment.Start,
  flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
  userScrollEnabled: Boolean = true,
  content: ThemeViewerScope.() -> Unit
) {
  LazyColumn(
    modifier = modifier,
    state = state,
    contentPadding = contentPadding,
    reverseLayout = reverseLayout,
    verticalArrangement = verticalArrangement,
    horizontalAlignment = horizontalAlignment,
    flingBehavior = flingBehavior,
    userScrollEnabled = userScrollEnabled,
  ) {
    ThemeViewerScope(this).content()
  }
}
