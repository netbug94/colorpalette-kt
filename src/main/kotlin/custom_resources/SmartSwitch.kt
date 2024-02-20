package custom_resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun smartSwitch(): Any {
    val displayState = LocalWindowInfo.current.containerSize.height
    return when {
        displayState <=   525 -> 0.8f
        displayState in   526..725 ->  1.1f
        displayState in   726..825 ->  1.4f
        displayState in   826..1125 ->  1.7f
        displayState in   1126..1325 ->  1.9f
        displayState in   1326..1525 ->  2.4f
        displayState >=   1527 ->  3f
        else ->  1f // Default size
    }
}