package engine_logic

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

const val COL_PAThA0 = "DBPaletteData/colorA0.hdi"
const val COL_PAThA1 = "DBPaletteData/colorA1.hdi"
const val COL_PAThA2 = "DBPaletteData/colorA2.hdi"
const val COL_PAThA3 = "DBPaletteData/colorA3.hdi"

const val COL_PAThB0 = "DBPaletteData/colorB0.hdi"
const val COL_PAThB1 = "DBPaletteData/colorB1.hdi"
const val COL_PAThB2 = "DBPaletteData/colorB2.hdi"
const val COL_PAThB3 = "DBPaletteData/colorB3.hdi"

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