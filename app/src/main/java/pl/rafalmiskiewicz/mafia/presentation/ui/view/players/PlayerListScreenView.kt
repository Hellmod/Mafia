package pl.rafalmiskiewicz.mafia.presentation.ui.view.players

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import pl.rafalmiskiewicz.mafia.R
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components.InsertPlayerView
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components.PlayerListView

@Composable
fun PlayerListScreenView(
    viewModel: PlayerListViewModel,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column() {

            InsertPlayerView(
                modifier = Modifier.height(50.dp),
                player = viewModel.player.value,
                onNameChange = viewModel::onNameChange,
                onAddPlayerClick = viewModel::onAddPlayerClick
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_smaller)))
            PlayerListView(
                modifier = Modifier.height(650.dp),
                playerList = viewModel.playerList.value,
                onEventItemClick = viewModel::onPlayerClick
            )

        }

    }
}