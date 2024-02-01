import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.hdiScn

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
        hdiScn("\uD83C\uDF35hdi\uD83C\uDF35")
    }
}