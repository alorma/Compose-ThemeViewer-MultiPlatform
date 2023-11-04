import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun App() {
  MaterialTheme {
    Scaffold(
      topBar = {
        TopAppBar(
          title = { Text(text = "Theme Viewer") },
        )
      },
    ) { padding ->
      Column(
        modifier = Modifier
          .consumeWindowInsets(padding)
          .padding(top = padding.calculateTopPadding()),
      ) {
        ThemeViewer()
      }
    }
  }
}