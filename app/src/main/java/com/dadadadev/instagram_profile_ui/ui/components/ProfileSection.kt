package com.dadadadev.instagram_profile_ui.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dadadadev.instagram_profile_ui.R

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RoundImage(
                image = painterResource(id = R.drawable.people),
                modifier = Modifier
                    .size(100.dp)
                    .weight(3f)
            )
            Spacer(modifier = Modifier.width(16.dp))
            StatsSection(modifier = Modifier.weight(7f))
        }
        ProfileDescription(
            displayName = "Poor Man",
            description = "Really good person!\n" +
                    "5 years of coding experience\n" +
                    "Can walk and run\n" +
                    "Always able to sleep",
            url = "https://internet.com/",
            followedBy = listOf("workout", "coding_times"),
            otherCount = 13
        )
    }
}