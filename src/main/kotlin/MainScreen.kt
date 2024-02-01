import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import dynamic_boxes.columnBoxesA
import engine_logic.dynBxsSpacerWidth

@Composable
fun mainScreen() {
    Box(modifier = Modifier.fillMaxSize().background(ErgoGray)) {

        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {

            dynBxsSpacerWidth()
            Column(modifier = Modifier.weight(1f)) { columnBoxesA()
            }
            Spacer(modifier = Modifier.width(0.dp))

            Column(modifier = Modifier.weight(1f)) {columnBoxesA()
            }
            dynBxsSpacerWidth()
        }
    }
}