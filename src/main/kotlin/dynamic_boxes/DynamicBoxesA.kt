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
import custom_resources.smartText
import engine_logic.*
import java.io.File

// Dynamic boxes A
@Composable
fun columnBoxesA(isLocked: Boolean) {
    val colorParsingA = ColorReadA()
    val colorPathA0 = "DBPaletteData/colorA0.hdi"
    val colorPathA1 = "DBPaletteData/colorA1.hdi"
    val colorPathA2 = "DBPaletteData/colorA2.hdi"
    val colorPathA3 = "DBPaletteData/colorA3.hdi"
    var loadedColorA0 by remember { mutableStateOf(Color(0xFF303030)) }
    var userInputA0 by remember { mutableStateOf("") }

    val boxesFont = smartText(1f)
    val bxsColor = "0xFF303030"

    LaunchedEffect(Unit) {
        val file = File(colorPathA0)
        if (!file.exists()) {
            val directory = File(file.parent)
            directory.mkdirs()
        }
        if (file.exists()) {
            val savedColorCode = file.readText()
            loadedColorA0 = parseColor(savedColorCode)
        }
    }
    Column(modifier = Modifier.padding(5.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
// Box A0
        Box(modifier = Modifier
            .weight(1f)
            .background((loadedColorA0), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField(value = userInputA0,
                    onValueChange = {
                            userInputA0 = it
                            loadedColorA0 = parseColor(it)
                            val file = File(colorPathA0)
                            file.writeText(it)},
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingA.readTiFileA0().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
// Box A1
        var loadedColorA1 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputA1 by remember { mutableStateOf("") }

        LaunchedEffect(Unit) {
            val file = File(colorPathA1)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorA1 = parseColor(savedColorCode)
            }
        }
        Box(modifier = Modifier
                .weight(1f)
                .background((loadedColorA1), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField(value = userInputA1,
                    onValueChange = {
                        userInputA1 = it
                        loadedColorA1 = parseColor(it)
                        val file = File(colorPathA1)
                        file.writeText(it)},
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingA.readTiFileA1().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
// Box A2
        var loadedColorA2 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputA2 by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            val file = File(colorPathA2)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorA2 = parseColor(savedColorCode)
            }
        }
        Box(modifier = Modifier
                .weight(1f)
                .background((loadedColorA2), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField(value = userInputA2,
                    onValueChange = {
                        userInputA2 = it
                        loadedColorA2 = parseColor(it)
                        val file = File(colorPathA2)
                        file.writeText(it)},
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingA.readTiFileA2().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
// Box A3
        var loadedColorA3 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputA3 by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            val file = File(colorPathA3)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorA3 = parseColor(savedColorCode)
            }
        }
        Box(modifier = Modifier
                .weight(1f)
                .background((loadedColorA3), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                TextField(value = userInputA3,
                    onValueChange = {
                        userInputA3 = it
                        loadedColorA3 = parseColor(it)
                        val file = File(colorPathA3)
                        file.writeText(it)},
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingA.readTiFileA3().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
    }
}
