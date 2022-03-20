package pl.rafalmiskiewicz.mafia.presentation.ui.view.players

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pl.rafalmiskiewicz.mafia.presentation.ui.main.MainViewModel

@Composable
fun PlayerListScreenView(
    viewModel: PlayerListViewModel,
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