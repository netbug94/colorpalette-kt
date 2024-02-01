package dynamic_boxes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import engine_logic.*
import java.io.File

@Composable
fun columnBoxesA() {
    var loadedColorA0 by remember { mutableStateOf(Color(0xFF303030)) }
    var userInputA0 by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        val file = File(COL_PAThA0)
        if (!file.exists()) {
            val directory = File(file.parent)
            directory.mkdirs()
        }
        if (file.exists()) {
            val savedColorCode = file.readText()
            loadedColorA0 = parseColor(savedColorCode)
        }
    }

    Column( modifier = Modifier.padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

////////////////////////////// Box A0
        Box( modifier = Modifier
            .weight(1f)
            .aspectRatio(1.5f)
            .background((loadedColorA0), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center
        ) {
            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                TextField( value = userInputA0,
                    onValueChange = {
                        userInputA0 = it
                        loadedColorA0 = parseColor(it)
                        val file = File(COL_PAThA0)
                        file.writeText(it) },
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White,
                        textAlign = TextAlign.Center),
                    placeholder = { Box( modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Transparent),
                        contentAlignment = Alignment.Center
                    ) {
                        Text( text = readTiFileA0().ifEmpty { "0xFF303030" },
                            color = Color.White, textAlign = TextAlign.Center)
                        }
                    }
                )
            }
        }
////////////////////////////// Box A1
        var loadedColorA1 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputA1 by remember { mutableStateOf("") }

        LaunchedEffect(Unit) {
            val file = File(COL_PAThA1)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorA1 = parseColor(savedColorCode)
            }
        }
        Box( modifier = Modifier
                .weight(1f)
                .aspectRatio(1.5f)
                .background((loadedColorA1), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center
        ) {
            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                TextField(
                    value = userInputA1,
                    onValueChange = {
                        userInputA1 = it
                        loadedColorA1 = parseColor(it)
                        val file = File(COL_PAThA1)
                        file.writeText(it)
                    },
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White,
                        textAlign = TextAlign.Center),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = readTiFileA1().ifEmpty { "0xFF303030" },
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }

////////////////////////////// Box A2
        var loadedColorA2 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputA2 by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            val file = File(COL_PAThA2)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorA2 = parseColor(savedColorCode)
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .aspectRatio(1.5f)
                .background((loadedColorA2), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center
        ) {
            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                TextField(
                    value = userInputA2,
                    onValueChange = {
                        userInputA2 = it
                        loadedColorA2 = parseColor(it)
                        val file = File(COL_PAThA2)
                        file.writeText(it)
                    },
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White,
                        textAlign = TextAlign.Center),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = readTiFileA2().ifEmpty { "0xFF303030" },
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }

////////////////////////////// Box A3
        var loadedColorA3 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputA3 by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            val file = File(COL_PAThA3)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorA3 = parseColor(savedColorCode)
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .aspectRatio(1.5f)
                .background((loadedColorA3), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center
        ) {
            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                TextField(
                    value = userInputA3,
                    onValueChange = {
                        userInputA3 = it
                        loadedColorA3 = parseColor(it)
                        val file = File(COL_PAThA3)
                        file.writeText(it)
                    },
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White,
                        textAlign = TextAlign.Center),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = readTiFileA3().ifEmpty { "0xFF303030" },
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }
    }
}
