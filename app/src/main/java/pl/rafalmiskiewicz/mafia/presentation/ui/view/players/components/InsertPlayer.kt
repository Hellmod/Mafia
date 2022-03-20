package pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.rafalmiskiewicz.mafia.data.model.Player


@Composable
fun InsertPlayerView(
    modifier: Modifier = Modifier,
    player: Player,
    onNameChange: (String) -> Unit,
    onAddPlayerClick: () -> Unit,
) {
    Row() {
        InputView(
            modifier = modifier.width(300.dp),
            value = player.name,
            onValueChange = onNameChange,
            labelText = "Imię",
            keyboardType = KeyboardType.Text
        )
        Button(onClick = onAddPlayerClick) {
            Text(text = "OK")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun InsertPlayerViewPreview() {
    InsertPlayerView(
        player = Player(0, "Rafał"),
        onNameChange = {},
        onAddPlayerClick = {}
    )
}