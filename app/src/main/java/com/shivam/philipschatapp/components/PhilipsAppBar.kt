package com.shivam.philipschatapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shivam.philipschatapp.R
import com.shivam.philipschatapp.ui.theme.PhilipsChatAppTheme
import com.shivam.philipschatapp.ui.theme.elevatedSurface

@Composable
fun PhilipsAppBar(
    modifier: Modifier = Modifier,
    onNavigationIconPressed: () -> Unit = { },
    title: @Composable RowScope.() -> Unit,
    actions: @Composable RowScope.() -> Unit = { }
) {
    val backgroundColor = MaterialTheme.colors.elevatedSurface(4.dp)
    Column(
        Modifier.background(backgroundColor.copy(alpha = 0.90f))
    ) {
        TopAppBar(
            modifier = modifier,
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            contentColor = MaterialTheme.colors.onSurface,
            actions = actions,
            title = { Row { title() } },
            navigationIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_philips_logo_shield),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = onNavigationIconPressed)
                        .padding(horizontal = 20.dp)
                )
            }
        )
        Divider()
    }
}

@Preview
@Composable
fun AppBarPreview() {
    PhilipsChatAppTheme {
        PhilipsAppBar(title = { Text("Let's Chat") })
    }
}

@Preview
@Composable
fun AppBarPreviewDark() {
    PhilipsChatAppTheme(darkTheme = true) {
        PhilipsAppBar(title = { Text("Let's Chat") })
    }
}