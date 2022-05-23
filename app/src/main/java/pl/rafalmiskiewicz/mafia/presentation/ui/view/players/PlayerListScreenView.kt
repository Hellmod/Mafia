package pl.rafalmiskiewicz.mafia.presentation.ui.view.players

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import pl.rafalmiskiewicz.mafia.R
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components.InsertPlayerView
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components.PlayerListView

@Destination(start = true)
@Composable
fun PlayerListScreenView(
    navigator: NavGraph,
    viewModel: PlayerListViewModel,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column() {
            Row(Modifier.height(50.dp)) {
                InsertPlayerView(
                    player = viewModel.player.value,
                    onNameChange = viewModel::onNameChange,
                    onAddPlayerClick = viewModel::onAddPlayerClick
                )
                Button(onClick = viewModel::onNextClick) {
                    Text(text = "Dalej")
                }
            }
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_smaller)))

            PlayerListView(
                modifier = Modifier.height(650.dp),
                playerList = viewModel.playerList.value,
                onEventItemClick = viewModel::onPlayerClick
            )

        }

    }
}