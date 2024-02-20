import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.olrScn
import views.mainScreen

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
        olrScn("olr")
    }
}