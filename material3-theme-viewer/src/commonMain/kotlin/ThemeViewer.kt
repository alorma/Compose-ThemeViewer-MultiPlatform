import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ThemeViewer(
  modifier: Modifier = Modifier
) {
  LazyColumn(
    modifier = modifier
      .background(MaterialTheme.colorScheme.errorContainer),
  ) {
    item { Text(text = "Hello") }
  }
}