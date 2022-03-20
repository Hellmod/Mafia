package pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import pl.rafalmiskiewicz.mafia.R
import pl.rafalmiskiewicz.mafia.data.model.Player

@Composable
fun PlayerListView(
    modifier: Modifier= Modifier,
    lazyListState: LazyListState = rememberLazyListState(),
    playerList: List<Player>,
    onEventItemClick: (Player) -> Unit
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        state = lazyListState
    ) {
        items(playerList) { item ->
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.space_xLarge)))
            PlayerInfoView(
                modifier = Modifier.fillMaxWidth(0.9f),
                item = item,
                onClick = onEventItemClick
            )
        }

        item {
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.space_xLarge)))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EventListViewPreview() {
    PlayerListView(
        playerList = listOf(Player(1, "Rafał")),
        onEventItemClick = {}
    )
}