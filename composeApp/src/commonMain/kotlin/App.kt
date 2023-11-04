import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun App() {
  MaterialTheme {
    Scaffold(
      topBar = {
        TopAppBar(
          backgroundColor = MaterialTheme.colors.background,
          title = { Text(text = getLibraryPlatformName()) },
        )
      },
    ) {
      LibComponent()
    }
  }
}