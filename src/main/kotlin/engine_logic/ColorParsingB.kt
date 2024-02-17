package engine_logic

import java.io.File

// Read and parse B
fun readTiFileB0(): String {
    return try {
        val file0 = File(COL_PAThB0).readText()
        file0
    } catch (e: Exception) {
        ""
    }
}
fun readTiFileB1(): String {
    return try {
        val file1 = File(COL_PAThB1).readText()
        file1
    } catch (e: Exception) {
        ""
    }
}
fun readTiFileB2(): String {
    return try {
        val file2 = File(COL_PAThB2).readText()
        file2
    } catch (e: Exception) {
        ""
    }
}
fun readTiFileB3(): String {
    return try {
        val file3 = File(COL_PAThB3).readText()
        file3
    } catch (e: Exception) {
        ""
    }
}
