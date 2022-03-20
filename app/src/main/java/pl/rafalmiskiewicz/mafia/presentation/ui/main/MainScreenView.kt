package pl.rafalmiskiewicz.mafia.presentation.ui.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.PlayerListView

@Composable
fun MainView(
    viewModel: MainViewModel,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        PlayerListView(
            playerList = viewModel.playerList.value,
            onEventItemClick = viewModel::onPlayerClick
        )
    }
}