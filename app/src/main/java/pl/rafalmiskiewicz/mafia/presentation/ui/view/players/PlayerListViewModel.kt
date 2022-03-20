package pl.rafalmiskiewicz.mafia.presentation.ui.view.players

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.rafalmiskiewicz.mafia.data.model.Player
import javax.inject.Inject

@HiltViewModel
class PlayerListViewModel @Inject constructor() : ViewModel() {
    val list = mutableListOf(
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
    val player = mutableStateOf(Player())

    fun onPlayerClick(onClickPlayer: Player) {
        playerList.value = playerList.value.filter { it.id != onClickPlayer.id }
    }

    fun onNameChange(value: String) {
        player.value = player.value.copy(
            name = value
        )
    }

    fun onAddPlayerClick() {
        playerList.value.map { it.id }.maxOrNull()

        val maxId = playerList.value.map { it.id }.maxOrNull() ?: -2
        val newList: MutableList<Player> = mutableListOf()
        playerList.value.forEach { player ->
            newList.add(player)
        }
        newList.add(player.value.copy(id = maxId + 1))
        playerList.value = newList
    }

}