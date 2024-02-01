import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import dynamic_boxes.columnBoxesA

@Composable
fun mainScnSpacer() { Spacer(modifier = Modifier.width(15.dp)) }

@Composable
fun mainScreen() {
    Box(modifier = Modifier.fillMaxSize().background(ErgoGray)) {

        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) { columnBoxesA()
            }
            mainScnSpacer()
            Column(modifier = Modifier.weight(1f)) {

            }
            mainScnSpacer()
            Column(modifier = Modifier.weight(1f)) {

            }
        }
    }
}