package com.charity.jointnewsletter.components.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

sealed class NavItem {
    object Home :
        Item(path = NavPath.HOME.toString(), title = NavTitle.HOME, icon = Icons.Default.Home)

    object Search :
        Item(path = NavPath.SEARCH.toString(), title = NavTitle.SEARCH, icon = Icons.Default.Search)

    object List :
        Item(path = NavPath.TOPICS.toString(), title = NavTitle.TOPICS, icon = Icons.AutoMirrored.Filled.List)

    object Profile :
        Item(
            path = NavPath.SETTINGS.toString(), title = NavTitle.SETTINGS, icon = Icons.Default.Settings)
}