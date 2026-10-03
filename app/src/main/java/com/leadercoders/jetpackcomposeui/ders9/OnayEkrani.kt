package com.leadercoders.jetpackcomposeui.ders9

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnayEkrani() {
    var siparisOnayDialogu by remember { mutableStateOf(false) }
    var menuAcikMi by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Sepetim") },
                actions = {
                    Box {
                        IconButton(onClick = { menuAcikMi = true }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "Menü")
                        }
                        DropdownMenu(
                            expanded = menuAcikMi,
                            onDismissRequest = { menuAcikMi = false }
                        ) {
                            DropdownMenuItem(
                                text = { Text("Sepeti Boşalt") },
                                onClick = { menuAcikMi = false }
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF673AB7), // Mor renk
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                )
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { siparisOnayDialogu = true },
                containerColor = Color(0xFF673AB7),
                contentColor = Color.White
            ) {
                Icon(imageVector = Icons.Default.Check, contentDescription = "Onayla")
                Spacer(modifier = Modifier.width(8.dp))
                Text("Siparişi Tamamla")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Sepet",
                modifier = Modifier.size(80.dp),
                tint = Color(0xFF673AB7)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Sepetinizde 3 adet ürün var.",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Toplam: 450 TL",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF673AB7)
            )
        }
    }

    if (siparisOnayDialogu) {
        AlertDialog(
            onDismissRequest = { siparisOnayDialogu = false },
            title = {
                Text(text = "Siparişi Onayla")
            },
            text = {
                Text(text = "450 TL tutarındaki siparişinizi onaylamak ve ödeme adımına geçmek istiyor musunuz?")
            },
            confirmButton = {
                Button(
                    onClick = { siparisOnayDialogu = false },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)) // Yeşil
                ) {
                    Text("Evet, Onayla")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { siparisOnayDialogu = false }
                ) {
                    Text("İptal Et", color = Color.Red)
                }
            }
        )
    }
}
