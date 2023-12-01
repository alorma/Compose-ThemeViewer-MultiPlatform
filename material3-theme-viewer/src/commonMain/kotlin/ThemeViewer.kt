import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ThemeViewer(
  modifier: Modifier = Modifier,
  customContent: LazyListScope.() -> Unit = {},
) {
  val isDark = isSystemInDarkTheme()
  val colorScheme = MaterialTheme.colorScheme

  LazyColumn(
    modifier = modifier,
    contentPadding = PaddingValues(16.dp),
    verticalArrangement = Arrangement.spacedBy(12.dp),
  ) {
    headerItem("Primary colors")
    colorItem(
      containerColor = colorScheme.primary,
      containerText = "primary",
    )
    colorItem(
      containerColor = colorScheme.primaryContainer,
      containerText = "primaryContainer",
    )
    subHeaderItem("onPrimary")
    colorItem(
      containerColor = colorScheme.onPrimary,
      contentColor = colorScheme.primary,
      borderColor = !isDark,
      containerText = "onPrimary",
    )
    colorItem(
      containerColor = colorScheme.onPrimaryContainer,
      contentColor = colorScheme.primaryContainer,
      containerText = "onPrimaryContainer",
    )
    headerItem("Secondary colors")
    colorItem(
      containerColor = colorScheme.secondary,
      containerText = "secondary",
    )
    colorItem(
      containerColor = colorScheme.secondaryContainer,
      containerText = "secondaryContainer",
    )
    subHeaderItem("onSecondary")
    colorItem(
      containerColor = colorScheme.onSecondary,
      contentColor = colorScheme.secondary,
      borderColor = !isDark,
      containerText = "onSecondary",
    )
    colorItem(
      containerColor = colorScheme.onSecondaryContainer,
      contentColor = colorScheme.secondaryContainer,
      containerText = "onSecondaryContainer",
    )
    headerItem("Tertiary colors")
    colorItem(
      containerColor = colorScheme.tertiary,
      containerText = "tertiary",
    )
    colorItem(
      containerColor = colorScheme.tertiaryContainer,
      containerText = "tertiaryContainer",
    )
    subHeaderItem("onTertiary")
    colorItem(
      containerColor = colorScheme.onTertiary,
      contentColor = colorScheme.tertiary,
      borderColor = !isDark,
      containerText = "onTertiary",
    )
    colorItem(
      containerColor = colorScheme.onTertiaryContainer,
      contentColor = colorScheme.tertiaryContainer,
      containerText = "onTertiaryContainer",
    )
    customContent()
  }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyListScope.headerItem(text: String) {
  stickyHeader {
    Surface(
      modifier = Modifier.height(48.dp).fillMaxWidth(),
    ) {
      Box(
        contentAlignment = Alignment.CenterStart
      ) {
        Text(
          text = text,
          style = MaterialTheme.typography.titleMedium,
        )
      }
    }
  }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyListScope.subHeaderItem(text: String) {
  stickyHeader {
    Surface(
      modifier = Modifier.height(48.dp).fillMaxWidth(),
    ) {
      Box(
        contentAlignment = Alignment.CenterStart
      ) {
        Text(
          text = text,
          style = MaterialTheme.typography.titleSmall,
        )
      }
    }
  }
}

private fun LazyListScope.colorItem(
  containerColor: Color,
  contentColor: Color = Color.Unspecified,
  borderColor: Boolean = false,
  containerText: String,
) {
  item {
    colorCard(
      containerColor = containerColor,
      contentColor = if (contentColor == Color.Unspecified) {
        contentColorFor(containerColor)
      } else {
        contentColor
      },
      containerText = containerText,
      showBorder = borderColor,
    )
  }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun colorCard(
  containerColor: Color,
  contentColor: Color = contentColorFor(containerColor),
  containerText: String,
  showBorder: Boolean,
) {
  Card(
    modifier = Modifier.height(80.dp).fillMaxWidth(),
    colors = CardDefaults.cardColors(
      containerColor = containerColor,
      contentColor = contentColor,
    ),
    onClick = {},
    border = if (showBorder) {
      CardDefaults.outlinedCardBorder()
    } else {
      null
    }
  ) {
    Column(
      modifier = Modifier.fillMaxSize().padding(8.dp),
      verticalArrangement = Arrangement.Bottom,
      horizontalAlignment = Alignment.End,
    ) {
      Text(
        text = containerText,
        style = MaterialTheme.typography.bodyMedium,
        fontWeight = FontWeight.Bold,
      )
    }
  }
}