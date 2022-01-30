package pl.rafalmiskiewicz.mafia.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import pl.rafalmiskiewicz.mafia.R

@Composable
fun ConnectView() {
    val name = "Kitty"

    Column() {
        Text(text = stringResource(id = R.string.codename,name))
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ConnectView()
}