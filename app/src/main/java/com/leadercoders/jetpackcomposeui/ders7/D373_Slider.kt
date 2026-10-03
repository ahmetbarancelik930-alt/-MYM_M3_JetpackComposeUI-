package com.leadercoders.jetpackcomposeui.ders7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf

import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun D373_Slider(){
    var sliderDegeri by remember { mutableFloatStateOf(50f) }
    var kademeDegeri by remember { mutableFloatStateOf(2f) }
    Column( modifier = Modifier.fillMaxSize().padding(24.dp)) {

        Text("Slider Değeri: ${sliderDegeri.toInt()}")

        Slider(
            value = sliderDegeri,
            onValueChange = {sliderDegeri = it},
            valueRange = 0f..100f
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text("Slider Değeri: ${kademeDegeri.toInt()}")

        Slider(
            value = kademeDegeri,
            onValueChange = {kademeDegeri = it},
            valueRange = 1f..3f,
            steps = 1
        )
    }
}