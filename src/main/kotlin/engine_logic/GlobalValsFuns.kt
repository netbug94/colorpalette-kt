package engine_logic

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun dynBxsSpacerWidth() { Spacer(modifier = Modifier.width(5.dp)) }

fun parseColor(input: String): Color {
    return try {
        val colorInt = input.removePrefix("0x").toLongOrNull(16) ?: throw NumberFormatException()
        Color(colorInt.toInt())
    } catch (e: NumberFormatException) {
        // Handle invalid color input
        Color(0xFF303030)
    }
}