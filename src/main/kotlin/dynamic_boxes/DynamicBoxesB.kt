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

// Dynamic boxes B
@Composable
fun columnBoxesB(isLocked: Boolean) {
    val colorParsingB = ColorParsingB()
    val colorPathB0 = "DBPaletteData/colorB0.hdi"
    val colorPathB1 = "DBPaletteData/colorB1.hdi"
    val colorPathB2 = "DBPaletteData/colorB2.hdi"
    val colorPathB3 = "DBPaletteData/colorB3.hdi"
    var loadedColorB0 by remember { mutableStateOf(Color(0xFF303030)) }
    var userInputB0 by remember { mutableStateOf("") }

    val boxesFont = smartText(1f)
    val bxsColor = "0xFF303030"

    LaunchedEffect(Unit) {
        val file = File(colorPathB0)
        if (!file.exists()) {
            val directory = File(file.parent)
            directory.mkdirs()
        }
        if (file.exists()) {
            val savedColorCode = file.readText()
            loadedColorB0 = parseColor(savedColorCode)
        }
    }
    Column( modifier = Modifier.padding(5.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
// Box B0
        Box(modifier = Modifier
            .weight(1f)
            .background((loadedColorB0), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField( value = userInputB0,
                    onValueChange = {
                        userInputB0 = it
                        loadedColorB0 = parseColor(it)
                        val file = File(colorPathB0)
                        file.writeText(it) },
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingB.readTiFileB0().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
// Box B1
        var loadedColorB1 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputB1 by remember { mutableStateOf("") }

        LaunchedEffect(Unit) {
            val file = File(colorPathB1)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorB1 = parseColor(savedColorCode)
            }
        }
        Box(modifier = Modifier
            .weight(1f)
            .background((loadedColorB1), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField(value = userInputB1,
                    onValueChange = {
                        userInputB1 = it
                        loadedColorB1 = parseColor(it)
                        val file = File(colorPathB1)
                        file.writeText(it) },
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingB.readTiFileB1().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
// Box B2
        var loadedColorB2 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputB2 by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            val file = File(colorPathB2)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorB2 = parseColor(savedColorCode)
            }
        }
        Box(modifier = Modifier
                .weight(1f)
                .background((loadedColorB2), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField(value = userInputB2,
                    onValueChange = {
                        userInputB2 = it
                        loadedColorB2 = parseColor(it)
                        val file = File(colorPathB2)
                        file.writeText(it) },
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingB.readTiFileB2().ifEmpty { bxsColor },
                                color = Color.White, textAlign = TextAlign.Center,
                                fontSize = boxesFont
                            )
                        }
                    }
                )
            }
        }
// Box B3
        var loadedColorB3 by remember { mutableStateOf(Color(0xFF303030)) }
        var userInputB3 by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            val file = File(colorPathB3)
            if (!file.exists()) {
                val directory = File(file.parent)
                directory.mkdirs()
            }
            if (file.exists()) {
                val savedColorCode = file.readText()
                loadedColorB3 = parseColor(savedColorCode)
            }
        }
        Box(modifier = Modifier
                .weight(1f)
                .background((loadedColorB3), shape = AbsoluteRoundedCornerShape(5.dp)),
            contentAlignment = Alignment.Center) {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                TextField(value = userInputB3,
                    onValueChange = {
                        userInputB3 = it
                        loadedColorB3 = parseColor(it)
                        val file = File(colorPathB3)
                        file.writeText(it) },
                    enabled = !isLocked, // Setting enabled based on isLocked state
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center, fontSize = boxesFont),
                    placeholder = {

                        Box(modifier = Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.Center) {
                            Text(text = colorParsingB.readTiFileB3().ifEmpty { bxsColor },
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
