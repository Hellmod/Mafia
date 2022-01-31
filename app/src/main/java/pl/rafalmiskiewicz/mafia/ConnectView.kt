package pl.rafalmiskiewicz.mafia.ui.theme

import android.widget.ImageButton
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.rafalmiskiewicz.mafia.CodenameGenerator
import pl.rafalmiskiewicz.mafia.R

@Composable
fun ConnectView() {
    val name = CodenameGenerator.generate()
    val opponentName = CodenameGenerator.generate()
    val status = R.string.status_disconnected
    val score = "0 : 0"

    Column() {
        Text(text = stringResource(id = R.string.codename, name))
        Text(text = stringResource(id = R.string.opponent_name, opponentName))
        Text(text = stringResource(id = status))
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Text(text = score)
        }

        Row() {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier.size(240.dp),
                    painter = painterResource(id = R.drawable.rock),
                    contentDescription = stringResource(id = R.string.choice_rock),
                    tint = MaterialTheme.colors.primary
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier.size(240.dp),
                    painter = painterResource(id = R.drawable.paper),
                    contentDescription = stringResource(id = R.string.choice_paper),
                    tint = MaterialTheme.colors.primary
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.scissors),
                    contentDescription = stringResource(id = R.string.choice_scissors),
                    tint = MaterialTheme.colors.primary
                )
            }
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            onClick = { }
        ) {
            Text(text = stringResource(id = R.string.action_find_opponents))
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            onClick = { }
        ) {
            Text(text = stringResource(id = R.string.action_disconnect))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ConnectView()
}