package engine_logic

import java.io.File
import java.io.IOException

object CreateFiles {
    private const val CPA0 = "DBPaletteData/colorA0.hdi"
    private const val CPA1 = "DBPaletteData/colorA1.hdi"
    private const val CPA2 = "DBPaletteData/colorA2.hdi"
    private const val CPA3 = "DBPaletteData/colorA3.hdi"
    
    private const val CPB0 = "DBPaletteData/colorB0.hdi"
    private const val CPB1 = "DBPaletteData/colorB1.hdi"
    private const val CPB2 = "DBPaletteData/colorB2.hdi"
    private const val CPB3 = "DBPaletteData/colorB3.hdi"
    init {
        createFiles()
    }
    fun createFiles() {
        val filesToCheck = listOf(CPA0, CPA1, CPA2, CPA3, CPB0, CPB1, CPB2, CPB3)
        for (filePath in filesToCheck) {
            val file = File(filePath)
            try {
                if (!file.exists()) {
                    val parentDir = file.parentFile
                    if (!parentDir.exists()) {
                        parentDir.mkdirs() // Create parent directories if they don't exist
                    }
                    file.createNewFile() // Create the file
                    // Add content to the files here
                }
            } catch (e: IOException) {
                e.printStackTrace() // Handle the exception
            }
        }
    }
}