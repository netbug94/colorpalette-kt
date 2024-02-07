package buttons

import androidx.compose.foundation.layout.*
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import custom_resources.BlueAlert
import custom_resources.RedAlert

@Composable
fun lockSwitch(isLocked: Boolean, onToggle: (Boolean) -> Unit) {
    Column(verticalArrangement = Arrangement.Top) {

        Row( modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {

            Box( modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center) {
                Text("Dynamic")
            }
            Switch( modifier = Modifier.scale(1.5f).weight(1f),
                checked = isLocked,
                onCheckedChange = { onToggle(!isLocked) }, // Toggling the state
                colors = SwitchDefaults.colors(
                    checkedThumbColor = BlueAlert,
                    checkedTrackColor = BlueAlert,
                    uncheckedThumbColor = RedAlert,
                    uncheckedTrackColor = RedAlert
                )
            )
            Box( modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center) {
                Text("Palette")
            }
        }
    }
}