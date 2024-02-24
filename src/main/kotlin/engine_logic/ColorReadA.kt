package engine_logic

import java.io.File

// Read and parse A
class ColorReadA {
    private val colorPath = "CPData"
    private val colorPathA0 = "CPData/colorA0.hdi"
    private val colorPathA1 = "CPData/colorA1.hdi"
    private val colorPathA2 = "CPData/colorA2.hdi"
    private val colorPathA3 = "CPData/colorA3.hdi"
    init {
        File(colorPath).mkdirs()
        for (i in  0 until  4) { // Number of files
            val fileName = "colorA$i.hdi"
            val file = File("${colorPath}/$fileName")
            if (!file.exists()) {
                file.createNewFile() // Create the file if it does not exist
            }
        }
    }

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