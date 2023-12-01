import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ThemeViewer(
  modifier: Modifier = Modifier,
  customContent: LazyListScope.() -> Unit = {},
) {
  val colorScheme = MaterialTheme.colorScheme

  LazyColumn(
    modifier = modifier,
    contentPadding = PaddingValues(16.dp),
    verticalArrangement = Arrangement.spacedBy(12.dp),
  ) {
    headerItem("Primary colors")
    colorItem(
      containerColor = colorScheme.primary,
      contentColor = colorScheme.onPrimary,
      containerText = "primary",
      contentText = "onPrimary",
    )
    colorItem(
      containerColor = colorScheme.primaryContainer,
      contentColor = colorScheme.onPrimaryContainer,
      containerText = "primaryContainer",
      contentText = "onPrimaryContainer",
    )
    headerItem("Error colors")
    colorItem(
      containerColor = colorScheme.errorContainer,
      contentColor = colorScheme.onErrorContainer,
      containerText = "errorContainer",
      contentText = "onErrorContainer",
    )
    customContent()
  }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyListScope.headerItem(text: String) {
  stickyHeader {
    Surface {
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

private fun LazyListScope.colorItem(
  containerColor: Color,
  contentColor: Color,
  containerText: String,
  contentText: String
) {
  item {
    colorCard(
      containerColor = containerColor,
      contentColor = contentColor,
      containerText = containerText,
      contentText = contentText,
    )
  }
}

@Composable
private fun colorCard(
  containerColor: Color,
  contentColor: Color,
  containerText: String,
  contentText: String
) {
  Card(
    modifier = Modifier.height(80.dp).fillMaxWidth(),
    colors = CardDefaults.cardColors(
      containerColor = containerColor,
      contentColor = contentColor,
    ),
  ) {
    Column(
      modifier = Modifier.fillMaxSize().padding(8.dp),
      verticalArrangement = Arrangement.Bottom,
      horizontalAlignment = Alignment.Start,
    ) {
      Text(
        text = containerText,
        style = MaterialTheme.typography.bodyMedium,
        fontWeight = FontWeight.Bold,
      )
      Spacer(modifier = Modifier.height(4.dp))
      Text(
        text = contentText,
        style = MaterialTheme.typography.labelSmall,
        fontStyle = FontStyle.Italic,
      )
    }
  }
}