package pl.rafalmiskiewicz.mafia.presentation.ui.nav

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.PlayerListScreenView
import pl.rafalmiskiewicz.mafia.presentation.ui.view.players.PlayerListViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            PlayerListScreenView(
                ,
                navController = navController
            )
        }
    }
}