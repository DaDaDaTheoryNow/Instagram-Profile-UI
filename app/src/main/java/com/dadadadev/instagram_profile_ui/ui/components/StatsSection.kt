package com.dadadadev.instagram_profile_ui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StatsSection(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ) {
        ProfileStats(numberText = "601", text = "Posts")
        ProfileStats(numberText = "91.2K", text = "Followers")
        ProfileStats(numberText = "71", text = "Following")
    }
}