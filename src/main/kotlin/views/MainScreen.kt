package views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import buttons.lockSwitch
import custom_resources.ErgoGray
import dynamic_boxes.columnBoxesA
import dynamic_boxes.columnBoxesB
import engine_logic.dynBxsSpacerWidth

@Composable
fun mainScreen() {
    var isLocked by remember { mutableStateOf(true) }

    Column(modifier = Modifier.fillMaxSize().background(ErgoGray)) {

        Row(modifier = Modifier.fillMaxSize().weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            lockSwitch(isLocked) { isLocked = it }
        }
        Column(modifier = Modifier.fillMaxSize().weight(10f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {

                dynBxsSpacerWidth()
                Column(modifier = Modifier.weight(1f)) {
                    columnBoxesA(isLocked)
                }
                Spacer(modifier = Modifier.width(0.dp))

                Column(modifier = Modifier.weight(1f)) {
                    columnBoxesB(isLocked)
                }
                dynBxsSpacerWidth()
            }
        }
    }
}