package pl.rafalmiskiewicz.mafia.presentation.ui.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.rafalmiskiewicz.mafia.data.model.Player
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    val list = listOf(
        Player(id = 0, name = "Rafał"),
        Player(id = 1, name = "Rafał"),
        Player(id = 2, name = "Rafał"),
        Player(id = 3, name = "Rafał"),
        Player(id = 4, name = "Rafał"),
        Player(id = 5, name = "Rafał"),
        Player(id = 6, name = "Rafał"),
        Player(id = 7, name = "Rafał"),
        Player(id = 8, name = "Rafał"),
        Player(id = 9, name = "Rafał"),
        Player(id = 10, name = "Rafał"),
        Player(id = 11, name = "Rafał"),
        Player(id = 12, name = "Rafał"),
        Player(id = 13, name = "Marzenka")
    )
    val playerList = mutableStateOf<List<Player>>(list)

    fun onPlayerClick(onClickPlayer: Player) {
        playerList.value = playerList.value.filter { it.id != onClickPlayer.id }
    }
}