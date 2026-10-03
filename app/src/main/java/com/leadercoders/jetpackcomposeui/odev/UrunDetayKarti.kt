package com.leadercoders.jetpackcomposeui.odev

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun UrunDetayKarti() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEAE1FC))
            .padding(all = 16.dp)
    ) {

        Box(
            modifier = Modifier

                .fillMaxWidth()
                .height(350.dp)
                .background(color = Color.White, shape = RoundedCornerShape(12.dp))
                .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(12.dp))


        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(text = "📸", modifier = Modifier.padding(all = 14.dp), fontSize = 20.sp)
                Text(text = "Ürün Görseli", modifier = Modifier.padding(all = 15.dp) ,fontSize = 20.sp)

            }

        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 20.dp)

        ) {
            Text(text = "Ürün Adı: ", fontSize = 18.sp, fontWeight =  FontWeight.Medium)
            Text(text = "Akıllı Saat",fontSize = 18.sp )
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Fiyat: ", fontSize = 18.sp, fontWeight =  FontWeight.Medium)
            Text(text = "1500 TL", fontSize = 18.sp, color = Color(0xFF2E7D32))


        }

        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier

                .background(color = Color(0xFF2563EB), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)

        ) {

            Text(text = "Sepete Ekle", fontSize = 18.sp, color = Color.White)

        }


    }


}