package pl.rafalmiskiewicz.mafia.presentation.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.PlayerListScreenView
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.PlayerListViewModel
import pl.rafalmiskiewicz.mafia.ui.theme.MafiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mViewModel: PlayerListViewModel by viewModels()

        setContent {
            MafiaTheme {
                PlayerListScreenView(viewModel = mViewModel)
            }
        }
    }
}