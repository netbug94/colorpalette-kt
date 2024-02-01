package engine_logic

import androidx.compose.ui.graphics.Color
import java.io.File

fun parseColor(input: String): Color {
    return try {
        val colorInt = input.removePrefix("0x").toLongOrNull(16) ?: throw NumberFormatException()
        Color(colorInt.toInt())
    } catch (e: NumberFormatException) {
        // Handle invalid color input
        Color(0xFF303030)
    }
}

//////////////////////////////
fun readTiFileA0(): String {
    return try {
        val file0 = File(COL_PAThA0).readText()
        file0
    } catch (e: Exception) {
        ""
    }
}
fun readTiFileA1(): String {
    return try {
        val file1 = File(COL_PAThA1).readText()
        file1
    } catch (e: Exception) {
        ""
    }
}
fun readTiFileA2(): String {
    return try {
        val file2 = File(COL_PAThA2).readText()
        file2
    } catch (e: Exception) {
        ""
    }
}
fun readTiFileA3(): String {
    return try {
        val file3 = File(COL_PAThA3).readText()
        file3
    } catch (e: Exception) {
        ""
    }
}