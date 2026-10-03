package com.leadercoders.jetpackcomposeui.ders7

import android.widget.Scroller
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AyarlarSayfasi() {
    var wifiBaglantisi by rememberSaveable () { mutableStateOf(false) }
    var bildirim by rememberSaveable () { mutableStateOf(false) }
    var ekranParlakligi by rememberSaveable() { mutableStateOf(50f) }
    var seciliDil by rememberSaveable () { mutableStateOf("Türkçe") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF4F4F9))
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = "Ayarlar", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Wifi,
                contentDescription = "Wi-Fi Bağlantısı",
                tint = Color(0xFF6200EE)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text("Wi-Fi Bağlantısı")
            Spacer(modifier = Modifier.weight(1f))
            Switch(
                checked = wifiBaglantisi,
                onCheckedChange = { wifiBaglantisi = it }
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Uygulama Bildirimleri",
                tint = Color(0xFF6200EE)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text("Uygulama Bildirimleri")
            Spacer(modifier = Modifier.weight(1f))
            Checkbox(
                checked = bildirim,
                onCheckedChange = { bildirim = it }
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Brightness6,
                contentDescription = "Ekran Parlaklığı",
                tint = Color(0xFF6200EE)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text("Ekran Parlaklığı")
        }
        Slider(
            value = ekranParlakligi,
            onValueChange = {ekranParlakligi = it },
            valueRange = 0f..100f,
        )
        HorizontalDivider(
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Language,
                contentDescription = "Uygulama Dili",
                tint = Color(0xFF6200EE)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text("Uygulama Dili")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(24.dp)
            ) {
            RadioButton(
                selected = seciliDil == "Türkçe",
                onClick = {seciliDil = "Türkçe"}
            )
            Text("Türkçe")
            Spacer(modifier = Modifier.padding(24.dp))

            RadioButton(
                selected = seciliDil == "İngilizce",
                onClick = {seciliDil = "İngilizce"}
            )
            Text("İngilizce")

        }


    }
}