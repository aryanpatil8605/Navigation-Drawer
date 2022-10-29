package com.example.navigationdrawercompose
import androidx.compose.ui.graphics.vector.ImageVector

//3
data class MenuItem(
    val id: String,
    val title: String,
    val icon: ImageVector,
    //-arp
    //5
    val contentDescription: String
    //-arp
)