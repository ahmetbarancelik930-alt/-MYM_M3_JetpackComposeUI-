package com.leadercoders.jetpackcomposeui.ders4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Spliterator

@Composable
fun D345_GirisyapEkrani() {
    var eposta by rememberSaveable() { mutableStateOf("") }
    var sifre by rememberSaveable() { mutableStateOf("") }
    var girisbasarli by rememberSaveable() { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Hoş geldiniz", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        OutlinedTextField(
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-posta Adresi") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next

            )

        )
        Spacer(modifier = Modifier.height(28.dp))
        OutlinedTextField(
            value = sifre,
            onValueChange = { sifre = it },
            label = { Text("Şifre") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done

            )

        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {
                if (eposta.isNotEmpty() && sifre.isNotEmpty()) {
                    girisbasarli = true
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))


        ) {
            Text(text = "Giriş Yap")
        }
        if (girisbasarli){
            Text(text = "Giriş Bşaralı", color = Color(0xFF229F29), fontWeight = FontWeight.Bold)
        }

    }
}