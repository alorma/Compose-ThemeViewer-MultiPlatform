import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LibComponent() {
  ElevatedCard(
    modifier = Modifier.padding(16.dp),
  ) {
    Column(
      modifier = Modifier.padding(16.dp),
    ) {
      Text("Hello")
      Spacer(modifier = Modifier.height(24.dp))
      FilledTonalButton(
        onClick = {},
      ) {
        Text(text = "Submit")
      }
    }
  }
}