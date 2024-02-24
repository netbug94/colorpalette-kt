package engine_logic

import java.io.File

// Read and parse B
class ColorReadB {
    private val colorPath = "CPData"
    private val colorPathB0 = "CPData/colorB0.hdi"
    private val colorPathB1 = "CPData/colorB1.hdi"
    private val colorPathB2 = "CPData/colorB2.hdi"
    private val colorPathB3 = "CPData/colorB3.hdi"

    init {
        File(colorPath).mkdirs()
        for (i in  0 until  4) { // Number of files
            val fileName = "colorB$i.hdi"
            val file = File("${colorPath}/$fileName")
            if (!file.exists()) {
                file.createNewFile() // Create the file if it does not exist
            }
        }
    }

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