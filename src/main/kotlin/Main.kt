import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.olrScn
import engine_logic.CreateFiles.createFiles
import views.mainScreen

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        createFiles()
        mainScreen()
        olrScn("\uD83C\uDF35olr")
    }
}