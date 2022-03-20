package pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.rafalmiskiewicz.mafia.R
import pl.rafalmiskiewicz.mafia.data.model.Player
import pl.rafalmiskiewicz.mafia.ui.theme.RadiusShape

@Composable
fun PlayerInfoView(
    modifier: Modifier = Modifier,
    item: Player,
    onClick: (Player) -> Unit
) {
    Column(
        modifier = modifier
            .shadow(
                elevation = 8.dp,
                shape = RadiusShape
            )
            .background(
                shape = RadiusShape,
                color = MaterialTheme.colors.surface
            )
            .clickable { onClick(item) }
            .padding(dimensionResource(id = R.dimen.padding_large)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${item.id}. ${item.name}",
            modifier = Modifier.padding(
                horizontal = dimensionResource(id = R.dimen.padding_large),
                vertical = dimensionResource(id = R.dimen.padding_large)
            ),
            style = MaterialTheme.typography.h4,
            color = colorResource(id = R.color.greyDark),
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EventInfoViewPreview() {
    val player = Player(
        id = 0,
        name = "Rafał"
    )

    PlayerInfoView(item = player, onClick = {})
}