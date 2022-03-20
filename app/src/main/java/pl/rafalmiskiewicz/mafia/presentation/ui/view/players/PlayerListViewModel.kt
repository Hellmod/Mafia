package pl.rafalmiskiewicz.mafia.presentation.ui.view.players

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.rafalmiskiewicz.mafia.data.model.Player
import javax.inject.Inject

@HiltViewModel
class PlayerListViewModel @Inject constructor() : ViewModel() {
    val list = listOf(
        Player(id = 0, name = "Rafał1"),
        Player(id = 1, name = "Rafał2"),
        Player(id = 2, name = "Rafał3"),
        Player(id = 3, name = "Rafał4"),
        Player(id = 4, name = "Rafał5"),
        Player(id = 5, name = "Rafał6"),
        Player(id = 6, name = "Rafał7"),
        Player(id = 7, name = "Rafał8"),
        Player(id = 8, name = "Rafał9"),
        Player(id = 9, name = "Rafał10"),
        Player(id = 10, name = "Rafał11"),
        Player(id = 11, name = "Rafał12"),
        Player(id = 12, name = "Rafał13"),
        Player(id = 13, name = "Marzenka14")
    )
    val playerList = mutableStateOf<List<Player>>(list)

    fun onPlayerClick(onClickPlayer: Player) {
        playerList.value = playerList.value.filter { it.id != onClickPlayer.id }
    }
}