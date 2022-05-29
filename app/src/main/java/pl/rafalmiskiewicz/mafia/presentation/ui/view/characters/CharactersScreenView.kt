package pl.rafalmiskiewicz.mafia.presentation.ui.view.characters

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CharactersScreenView() {
    Text(text = "Postacie")
}

@Preview(showBackground = true)
@Composable
fun CharactersScreenViewPreview() {
    CharactersScreenView()
}