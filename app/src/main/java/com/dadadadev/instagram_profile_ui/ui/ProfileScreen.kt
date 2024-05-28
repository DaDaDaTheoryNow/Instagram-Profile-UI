package com.dadadadev.instagram_profile_ui.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dadadadev.instagram_profile_ui.common.ImageWithText
import com.dadadadev.instagram_profile_ui.R
import com.dadadadev.instagram_profile_ui.ui.components.ButtonSection
import com.dadadadev.instagram_profile_ui.ui.components.HighlightSection
import com.dadadadev.instagram_profile_ui.ui.components.PostSection
import com.dadadadev.instagram_profile_ui.ui.components.PostTabView
import com.dadadadev.instagram_profile_ui.ui.components.ProfileSection
import com.dadadadev.instagram_profile_ui.ui.components.TopBar

@Composable
fun ProfileScreen() {
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            name = "vladislav_smirnov",
            modifier = Modifier
                .padding(10.dp))
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
        ButtonSection()
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(
            highlights = listOf(
                ImageWithText(
                    image = painterResource(R.drawable.youtube),
                    text = "YouTube"
                ),
                ImageWithText(
                    image = painterResource(R.drawable.qa),
                    text = "Q&A "
                ),
                ImageWithText(
                    image = painterResource(R.drawable.discord),
                    text = "Discord"
                ),
                ImageWithText(
                    image = painterResource(R.drawable.youtube),
                    text = "YouTube"
                ),
                ImageWithText(
                    image = painterResource(R.drawable.qa),
                    text = "Q&A "
                ),
                ImageWithText(
                    image = painterResource(R.drawable.discord),
                    text = "Discord"
                ),
                ImageWithText(
                    image = painterResource(R.drawable.youtube),
                    text = "YouTube"
                ),
                ImageWithText(
                    image = painterResource(R.drawable.qa),
                    text = "Q&A "
                ),
                ImageWithText(
                    image = painterResource(R.drawable.discord),
                    text = "Discord"
                )
            ),
        )
        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            imageWithTexts = listOf(
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_grid),
                    text = "Posts"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_reels),
                    text = "Reels"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_igtv),
                    text = "IGTV"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.profile),
                    text = "Posts"
                ),
            )
        ) {
            selectedTabIndex = it
        }
        when (selectedTabIndex) {
            0 -> PostSection(
                posts = listOf(
                    painterResource(R.drawable.kmm),
                    painterResource(R.drawable.intermediate_dev),
                    painterResource(R.drawable.master_logical_thinking),
                    painterResource(R.drawable.bad_habits),
                    painterResource(R.drawable.multiple_languages),
                    painterResource(R.drawable.learn_coding_fast),
                    painterResource(R.drawable.kmm),
                    painterResource(R.drawable.intermediate_dev),
                    painterResource(R.drawable.master_logical_thinking),
                    painterResource(R.drawable.bad_habits),
                    painterResource(R.drawable.multiple_languages),
                    painterResource(R.drawable.learn_coding_fast),
                )
            )
        }
    }
}