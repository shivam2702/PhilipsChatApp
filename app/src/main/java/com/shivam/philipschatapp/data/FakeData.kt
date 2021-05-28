package com.shivam.philipschatapp.data

import com.shivam.philipschatapp.R

val initialMessages = listOf(
    Message(
        "John Glenn",
        "Knowledge is power what do you feel you would bring to the table if you were hired for this position. https://www.linkedin.com/in/shivam-android",
        1621848660000
    ),
    Message(
        "Taylor Brooks",
        "Viral engagement knowledge is power we need to aspirationalise our offerings work flows , for 360 degree content marketing pool data-point, per my previous email",
        1621848900000
    ),
    Message(
        "me",
        "Copy and paste from stack overflow what the form without content style without meaning onward and upward, productize the deliverables and focus on the bottom line so thinking outside the box UX, but drop-dead date. Push back.",
        1621848905000
    ),
    Message(
        "me",
        "Check it out! We have a new logo.",
        1621865520000
    ),
    Message(
        "me",
        "",
        1621865535000,
        R.drawable.sticker
    ),
    Message(
        "Taylor Brooks",
        "Wow this looks amazing.",
        1621865655000
    ),
    Message(
        "John Glenn",
        "Sorry guys, I slept early yesterday",
        1621906200000
    ),
    Message(
        "Taylor Brooks",
        "Let's update the logo in the apps.",
        1621906500000,
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#composers",
    channelMembers = 42
)