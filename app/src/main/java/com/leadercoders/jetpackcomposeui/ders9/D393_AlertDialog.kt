package com.leadercoders.jetpackcomposeui.ders9



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun D393_ALertDialog(){
    var pencereAcikmi by remember() { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {pencereAcikmi = true}) {
            Text("Silmeyi Onayla")
        }
    }

    if (pencereAcikmi){
        AlertDialog(
            onDismissRequest ={pencereAcikmi = false} ,
            icon = {
                Icon(imageVector = Icons.Default.Warning, contentDescription = "Uyarı")
            },
            title = { Text("Eminmisin?") },
            text = {Text("Bu işlem geri alınamaz yapmak istediğine eminisib")},
            dismissButton = {
                TextButton(onClick = {pencereAcikmi = false}) {
                    Text("İptal")
                }
            },
            confirmButton = {
                Button(onClick = {pencereAcikmi = false}) {
                    Text("Onayla")
                }
            }
        )
    }

}