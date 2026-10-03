package com.leadercoders.jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.leadercoders.jetpackcomposeui.ders1.SelamlamaEkrani
import com.leadercoders.jetpackcomposeui.ders2.D322_TemelDizilimler
import com.leadercoders.jetpackcomposeui.ders2.D326_ProfilKarti
import com.leadercoders.jetpackcomposeui.ders3.D332_TextBileseni
import com.leadercoders.jetpackcomposeui.ders3.D33_ButonCesitleri
import com.leadercoders.jetpackcomposeui.ders3.GununSozu
import com.leadercoders.jetpackcomposeui.ders4.BizeUlasinFormu
import com.leadercoders.jetpackcomposeui.ders4.D344_KullanicidanVeriAlma
import com.leadercoders.jetpackcomposeui.ders4.D345_GirisyapEkrani
import com.leadercoders.jetpackcomposeui.ders6.D362_ResimEkleme
import com.leadercoders.jetpackcomposeui.ders6.D363_IkonEkleme
import com.leadercoders.jetpackcomposeui.ders6.D364_KartEkleme
import com.leadercoders.jetpackcomposeui.ders6.YemekTarifiKarti
import com.leadercoders.jetpackcomposeui.ders7.AyarlarSayfasi
import com.leadercoders.jetpackcomposeui.ders7.D372_TekliVeCokluSecim
import com.leadercoders.jetpackcomposeui.ders7.D373_Slider
import com.leadercoders.jetpackcomposeui.ders7.D374_Switch
import com.leadercoders.jetpackcomposeui.ders7.PizzaSiparisEkrani
import com.leadercoders.jetpackcomposeui.ders8.D382_LazyColumn
import com.leadercoders.jetpackcomposeui.ders8.D384_DinamikListeUretemi
import com.leadercoders.jetpackcomposeui.ders8.KartListesi
import com.leadercoders.jetpackcomposeui.ders8.LazyRow
import com.leadercoders.jetpackcomposeui.ders8.RehberUygulamasi
import com.leadercoders.jetpackcomposeui.ders8.YaziKarti
import com.leadercoders.jetpackcomposeui.ders9.D392_Scaffold
import com.leadercoders.jetpackcomposeui.ders9.D393_ALertDialog
import com.leadercoders.jetpackcomposeui.ders9.D394_DropDownMenu

import com.leadercoders.jetpackcomposeui.ders9.ETicaretUrunuKatolgu
import com.leadercoders.jetpackcomposeui.ders9.OnayEkrani
//import com.leadercoders.jetpackcomposeui.ders9.OnayEkrani

import com.leadercoders.jetpackcomposeui.odev.UrunDetayKarti
import com.leadercoders.jetpackcomposeui.proje.KullaniciKayitEkrani
import com.leadercoders.jetpackcomposeui.proje.SifremiUnuttumEkrani
import com.leadercoders.jetpackcomposeui.ui.theme.GR01_MYM_M3_JetpackComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GR01_MYM_M3_JetpackComposeUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        //Ders1
                        //SelamlamaEkrani()

                        //DERS2
                       // D322_TemelDizilimler()

                     //   D326_ProfilKarti()

                        //ODEV
                        //UrunDetayKarti()

                        //Ders3
                       //D332_TextBileseni()
                       // D33_ButonCesitleri()
                        //GununSozu()
                        //D344_KullanicidanVeriAlma()
                        //D345_GirisyapEkrani()
                       // BizeUlasinFormu()
                       // KullaniciKayitEkrani()
                        //SifremiUnuttumEkrani()

                        //DERS6
                       // D362_ResimEkleme()
                      //  D363_IkonEkleme()
                       // D364_KartEkleme()
                        //YemekTarifiKarti()
                       // D372_TekliVeCokluSecim()
                        //D373_Slider()
                       // D374_Switch()
                        //PizzaSiparisEkrani()
                        //AyarlarSayfasi()
                        //D382_LazyColumn()
                        //LazyRow()
                       // D384_DinamikListeUretemi()
                       // RehberUygulamasi()
                        //KartListesi()
                       //D392_Scaffold()
                        // D393_ALertDialog()
                        //OnayEkrani()
                       // D394_DropDownMenu()
                        //OnayEkrani()
                        ETicaretUrunuKatolgu()



                    }
                }
            }
        }
    }
}


