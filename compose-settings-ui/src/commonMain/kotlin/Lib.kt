import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun LibComponent() {
  Text("Hello from ${getLibraryPlatformName()}")
}