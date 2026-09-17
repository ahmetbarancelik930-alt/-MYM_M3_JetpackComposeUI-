package com.leadercoders.jetpackcomposeui.proje


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment


@Composable
fun Sifremiunuttumekrani() {
    var adSoyad by rememberSaveable() { mutableStateOf("") }
    var eposta by rememberSaveable() { mutableStateOf("") }
    var sifre by rememberSaveable() { mutableStateOf("") }
    var yas by rememberSaveable() { mutableStateOf("") }
    var kayitBasarilimi by rememberSaveable() { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .background(color = Color(0xFFF8F9FA))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF2196F3), shape = RoundedCornerShape(16.dp))
                .padding(16.dp),
            contentAlignment = Alignment.Center


        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Aramıza Katılın!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Lütfen Bilgilerinizi Eksiksiz Doldurun!",
                    fontSize = 14.sp,
                    color = Color(0xFFE3F2FD)
                )
            }


        }
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = adSoyad,
            onValueChange = { adSoyad = it },
            label = { Text("Ad Soyad") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )

        )

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-posta Adresi") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )

        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = sifre,
            onValueChange = { sifre = it },
            label = { Text("Şifre") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Next
            )

        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = yas,
            onValueChange = { yas = it },
            label = { Text("Yaşınız") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            )

        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (adSoyad.isNotEmpty() && yas.isNotEmpty() && eposta.isNotEmpty() && sifre.isNotEmpty()) {
                    kayitBasarilimi = true
                }
            },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
            shape = RoundedCornerShape(8.dp)


        ) {

            Text(text = "Hesap Oluştur", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }

        if (kayitBasarilimi) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Hesabınız Başarıyla Oluşturuldu",
                color = Color(0xFF388E3C),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.weight(1f))


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(text = "Zaten hesabınız var mı?  ", color = Color.Gray)
            TextButton(
                onClick = {},

            ) {

                Text(text = " Giriş Yap", color = Color.Blue)


            }
        }


    }
}