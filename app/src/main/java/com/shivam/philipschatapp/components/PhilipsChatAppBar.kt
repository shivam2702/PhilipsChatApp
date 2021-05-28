package com.shivam.philipschatapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shivam.philipschatapp.ui.theme.PhilipsChatAppTheme

@Composable
fun ChatAppBar(
    channelName: String,
    channelMembers: Int,
    modifier: Modifier = Modifier,
    onNavigationIconPressed: () -> Unit = { }
) {
    PhilipsAppBar(
        modifier = modifier,
        onNavigationIconPressed = onNavigationIconPressed,
        title = {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.End,
            ) {
                Text(text = channelName, style = MaterialTheme.typography.subtitle1)
                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                    Text("$channelMembers members", style = MaterialTheme.typography.caption)
                }
            }
        }
    )
}

@Preview
@Composable
fun ChannelBarPrev() {
    PhilipsChatAppTheme() {
        ChatAppBar(channelName = "JetPack Compose Demo", channelMembers = 52)
    }
}

@Preview
@Composable
fun ChannelBarPrevDark() {
    PhilipsChatAppTheme(darkTheme = true) {
        ChatAppBar(channelName = "JetPack Compose Demo", channelMembers = 52)
    }
}
