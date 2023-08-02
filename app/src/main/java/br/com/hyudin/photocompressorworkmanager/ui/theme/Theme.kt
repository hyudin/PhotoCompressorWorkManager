package br.com.hyudin.photocompressorworkmanager.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import br.com.hyudin.photocompressorworkmanager.PhotoCompressionWorker

private val DarkColorPalette = darkColors(
    primary = Color.Green,
    background = DarkBlue,
    primaryVariant = Color.DarkGray,
    onBackground = TextWhite
)


@Composable
fun PhotoCompressionWorkerAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}