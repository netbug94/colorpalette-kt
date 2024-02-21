package buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import custom_resources.BlueAlert
import custom_resources.RedAlert
import custom_resources.smartSwitch
import custom_resources.smartText

@Composable
fun lockSwitch(isLocked: Boolean, onToggle: (Boolean) -> Unit) {
    val switchScale = smartSwitch()

    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

        Row(modifier = Modifier.fillMaxSize().weight(10f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Text("Dynamic", color = if (isLocked) BlueAlert else RedAlert, fontWeight = FontWeight.Bold,
                fontSize = smartText(1.2f)
            )
        }
        Switch(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .scale(switchScale as Float),
            checked = isLocked,
            onCheckedChange = { onToggle(!isLocked) },
            colors = SwitchDefaults.colors(
                checkedThumbColor = BlueAlert,
                checkedTrackColor = BlueAlert,
                uncheckedThumbColor = RedAlert,
                uncheckedTrackColor = RedAlert
            )
        )

        Row(modifier = Modifier.fillMaxSize().weight(10f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Text("Palette", color = if (isLocked) BlueAlert else RedAlert, fontWeight = FontWeight.Bold,
                fontSize = smartText(1.2f))
        }
    }
}
