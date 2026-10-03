package com.leadercoders.jetpackcomposeui.ders9


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun D392_Scaffold() {
    var menuAcikmi by remember() { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ana Başlık") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menü")

                    }
                },
                actions = {

                    Box(){
                        IconButton(onClick = {menuAcikmi = true}) {
                            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Açılı menü")
                        }

                        DropdownMenu(
                            expanded = menuAcikmi,
                            onDismissRequest = {menuAcikmi = false}
                        ) {
                            DropdownMenuItem(
                                text = { Text("Ayarlar") },
                                onClick = {menuAcikmi = false}
                            )

                            DropdownMenuItem(
                                text = { Text("Çıkış Yap") },
                                onClick = {menuAcikmi = false }
                            )
                        }
                    }
                }

            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ) {
                Text(text = "Alt Menü Çubuğu", modifier = Modifier.padding(16.dp))

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.Cyan
            ){
                Icon(imageVector = Icons.Default.Add, contentDescription = "Ekle")
            }
        }

    ) { icBosluklar ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(icBosluklar)
                .padding(20.dp)
        ) {
            Text("Burası sayfa içeriğinin olduğu yer")
        }

    }

}