package com.leadercoders.jetpackcomposeui.ders3

import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GununSozu() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFF9FAFB))
            .padding(24.dp)


    ) {

        Box(
            modifier = Modifier
                .background(color = Color.White)
                .border(1.dp, color = Color.LightGray, shape = RoundedCornerShape(12.dp))
                .padding(24.dp)
        ) {
            Column(
            ) {
                Text(
                    text = "✨ Günün Sözü",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD946EF)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Dün zekiydim, dünyayı değiştirmek isterdim. Bugün bilgeyim, kendimi değiştiriyorum.",
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                    lineHeight = 32.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Mevlana Celaleddin-i Rumi'ye atfedilen bu harika söz, değişimin önce insanın kendi içinde başlaması gerektiğini anlatır. Kişisel gelişimin en temel kuralıdır.",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.clickable {

                    }

                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "- Mevlana",
                    fontSize = 16.sp,
                    color = Color.DarkGray,
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth()


                )
                Spacer(modifier = Modifier.height(16.dp))

                HorizontalDivider(
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(color = Color(0xFFF1F5F9))
                        .clickable {}
                        .padding(12.dp)

                ) {
                    Text(
                        text = "❤️ 124 Beğeni (Tıklamak için dokunun)",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically


                ) {
                    TextButton(onClick = {}) {
                        Text("Kaydet", color = Color.Blue)
                    }


                    Spacer(modifier = Modifier.weight(1f))

                    OutlinedButton(onClick = {}) {
                        Text("Kopyala", color = Color.Black)
                    }


                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth(),

                    ) {
                    Text("Paylaş")
                }
            }


        }


    }

}