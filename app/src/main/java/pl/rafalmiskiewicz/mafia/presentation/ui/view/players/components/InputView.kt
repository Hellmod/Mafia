package pl.rafalmiskiewicz.mafia.presentation.ui.view.players.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputView(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String = "",
    placeholderText: String = "",
    imeAction: ImeAction = ImeAction.Next,
    onImeAction: () -> Unit = {},
    keyboardType: KeyboardType = KeyboardType.Text,
    onBlurred: () -> Unit = {}
) {
    val (showPassword, setShowPassword) = remember { mutableStateOf(false) }
    val transformation = if (keyboardType == KeyboardType.Password && !showPassword) {
        PasswordVisualTransformation()
    } else {
        VisualTransformation.None
    }
    val isBlurred = remember { mutableStateOf(false) }

    OutlinedTextField(
        modifier = modifier.onFocusChanged {
            if (!it.isFocused && isBlurred.value) {
                onBlurred()
            }
            if (it.isFocused) {
                isBlurred.value = true
            }
        },
        value = value,
        onValueChange = onValueChange,
        textStyle = MaterialTheme.typography.body2,
        placeholder = textComponentOrNull(placeholderText),
        label = textComponentOrNull(labelText),
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction
        ),
        keyboardActions = KeyboardActions {
            onImeAction()
        },
        visualTransformation = transformation,
        maxLines = 1
    )
}

private fun textComponentOrNull(labelText: String): @Composable (() -> Unit)? =
    if (labelText.isNotEmpty()) {
        {
            Text(
                text = labelText,
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.body2
            )
        }
    } else {
        null
    }

@Preview
@Composable
fun InputViewPreview() {
    val value = remember {
        mutableStateOf("")
    }
    InputView(
        value = value.value,
        onValueChange = { value.value = it },
        labelText = "Label",
    )
}