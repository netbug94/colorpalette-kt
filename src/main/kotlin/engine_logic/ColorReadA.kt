package engine_logic

import java.io.File

// Read and parse A
class ColorReadA {
    private val colorPathA0 = "DBPaletteData/colorA0.hdi"
    private val colorPathA1 = "DBPaletteData/colorA1.hdi"
    private val colorPathA2 = "DBPaletteData/colorA2.hdi"
    private val colorPathA3 = "DBPaletteData/colorA3.hdi"

    fun readTiFileA0(): String {
        return try {
            val file0 = File(colorPathA0).readText()
            file0
        } catch (e: Exception) {
            ""
        }
    }

    fun readTiFileA1(): String {
        return try {
            val file1 = File(colorPathA1).readText()
            file1
        } catch (e: Exception) {
            ""
        }
    }

    fun readTiFileA2(): String {
        return try {
            val file2 = File(colorPathA2).readText()
            file2
        } catch (e: Exception) {
            ""
        }
    }

    fun readTiFileA3(): String {
        return try {
            val file3 = File(colorPathA3).readText()
            file3
        } catch (e: Exception) {
            ""
        }
    }
}