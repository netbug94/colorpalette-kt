package engine_logic

import androidx.compose.ui.graphics.Color

fun parseColor(input: String): Color {
    return try {
        val colorInt = input.removePrefix("0x").toLongOrNull(16) ?: throw NumberFormatException()
        Color(colorInt.toInt())
    } catch (e: NumberFormatException) {
        // Handle invalid color input
        Color(0xFF303030)
    }
}