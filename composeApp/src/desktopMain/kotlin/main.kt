import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.alorma.material3.theme.sample.App

@OptIn(ExperimentalMaterial3Api::class)
fun main() = application {
  Window(onCloseRequest = ::exitApplication) {
    val colorScheme = if (isSystemInDarkTheme()) {
      darkColorScheme()
    } else {
      lightColorScheme()
    }
    MaterialTheme(colorScheme = colorScheme) {
      PermanentNavigationDrawer(
        modifier = Modifier.fillMaxHeight(),
        drawerContent = { PermanentDrawerSheet { App() } },
      ) {
        Scaffold(
          topBar = { TopAppBar(title = { Text(text = "Desktop demo") }) },
        ) {
          Text(text = "Demo")
        }
      }
    }
  }
}