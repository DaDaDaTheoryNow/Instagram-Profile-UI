package com.dadadadev.instagram_profile_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dadadadev.instagram_profile_ui.ui.ProfileScreen
import com.dadadadev.instagram_profile_ui.ui.theme.InstagramProfileUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramProfileUITheme {
                ProfileScreen()
            }
        }
    }
}