package views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import custom_resources.BlueAlert
import custom_resources.RedAlert

@Composable
fun lockSwitch() {
    var checked by remember { mutableStateOf(true) }

    Column(verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Switch(
                modifier = Modifier.scale(1.5f),
                checked = checked,
                onCheckedChange = { checked = it },

                colors = SwitchDefaults.colors(
                    checkedThumbColor = BlueAlert,
                    checkedTrackColor = BlueAlert,
                    uncheckedThumbColor = RedAlert,
                    uncheckedTrackColor = RedAlert
                )
            )
        }
    }
}
