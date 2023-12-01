import androidx.compose.ui.window.ComposeUIViewController
import com.alorma.material3.theme.sample.App
import com.alorma.material3.theme.sample.theme.AppTheme

fun MainViewController() = ComposeUIViewController {
  AppTheme {
    App()
  }
}
