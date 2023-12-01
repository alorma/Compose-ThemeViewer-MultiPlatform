import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.window.ComposeUIViewController
import com.alorma.material3.theme.sample.App

fun MainViewController() = ComposeUIViewController {
  val colorScheme = if (isSystemInDarkTheme()) {
    darkColorScheme()
  } else {
    lightColorScheme()
  }
  MaterialTheme(colorScheme = colorScheme) {
    App()
  }
}
