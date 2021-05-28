package com.shivam.philipschatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.shivam.philipschatapp.components.ConversationContent
import com.shivam.philipschatapp.data.exampleUiState
import com.shivam.philipschatapp.helper.LocalBackPressedDispatcher
import com.shivam.philipschatapp.ui.theme.PhilipsChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ProvideWindowInsets(consumeWindowInsets = true) {
                CompositionLocalProvider(
                    LocalBackPressedDispatcher provides this.onBackPressedDispatcher
                ) {
                    PhilipsChatAppTheme {
                        Scaffold {
                            Surface(color = MaterialTheme.colors.background) {
                                ConversationContent(uiState = exampleUiState, {})
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PhilipsChatAppTheme {
        ConversationContent(uiState = exampleUiState, {})
    }
}