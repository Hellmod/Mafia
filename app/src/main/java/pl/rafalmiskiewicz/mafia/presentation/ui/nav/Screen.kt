package pl.rafalmiskiewicz.mafia.presentation.ui.nav

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object SecondScreen : Screen("second_screen")
}
