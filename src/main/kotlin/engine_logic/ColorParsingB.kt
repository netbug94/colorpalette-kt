package engine_logic

import java.io.File

class ColorParsingB {
    private val colorPathB0 = "DBPaletteData/colorB0.hdi"
    private val colorPathB1 = "DBPaletteData/colorB1.hdi"
    private val colorPathB2 = "DBPaletteData/colorB2.hdi"
    private val colorPathB3 = "DBPaletteData/colorB3.hdi"

    // Read and parse B
    fun readTiFileB0(): String {
        return try {
            val file0 = File(colorPathB0).readText()
            file0
        } catch (e: Exception) {
            ""
        }
    }

    fun readTiFileB1(): String {
        return try {
            val file1 = File(colorPathB1).readText()
            file1
        } catch (e: Exception) {
            ""
        }
    }

    fun readTiFileB2(): String {
        return try {
            val file2 = File(colorPathB2).readText()
            file2
        } catch (e: Exception) {
            ""
        }
    }

    fun readTiFileB3(): String {
        return try {
            val file3 = File(colorPathB3).readText()
            file3
        } catch (e: Exception) {
            ""
        }
    }
}