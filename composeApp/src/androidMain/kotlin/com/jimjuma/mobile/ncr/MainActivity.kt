package com.jimjuma.mobile.ncr

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val systemUiController = rememberSystemUiController()
            systemUiController.setSystemBarsColor(
                color = Color.White, // Color as Long
                darkIcons = false // false to make the status bar icons and text white
            )
            systemUiController.setNavigationBarColor(
                color = Color.White,
                darkIcons = false
            )
            enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.light(
                    Color(0xFF862330).toArgb(),
                    Color(0xFF862330).toArgb()
                ),
                navigationBarStyle = SystemBarStyle.light(
                    Color(0xFF862330).toArgb(),  Color(0xFF862330).toArgb()
                )
            )
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}