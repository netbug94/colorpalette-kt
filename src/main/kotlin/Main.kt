import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.ornScn
import views.mainScreen

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
        ornScn("\uD83C\uDF35orn")
    }
}