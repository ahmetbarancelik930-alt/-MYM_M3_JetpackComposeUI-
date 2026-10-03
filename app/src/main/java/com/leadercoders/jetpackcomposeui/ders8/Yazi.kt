package com.leadercoders.jetpackcomposeui.ders8

data class Yazi(val baslik: String, val icerik: String, val yazar: String)


val yaziListesi = listOf(
    Yazi("Jetpack Compose Harika", "Modern Android arayüz geliştirme aracı olan Jetpack Compose ile daha az kod yazarak daha çok iş yapabilirsiniz.", "Ahmet Y."),
    Yazi("LazyColumn ile Performans", "Binlerce veriyi ekranda donmadan göstermek için LazyColumn tam size göre. Yalnızca ekrandaki öğeleri çizer.", "Zeynep K."),
    Yazi("Kotlin'in Gücü", "Kotlin dilinin sağladığı null güvenliği ve extension fonksiyonları ile kod yazmak çok daha keyifli.", "Mehmet A."),
    Yazi("Tasarım Sistemleri", "Uygulamanızın tutarlı görünmesi için renk, tipografi ve şekillerden oluşan bir tasarım sistemi kurmalısınız.", "Ayşe D."),
    Yazi("Mobil Uygulama Mimarisi", "MVVM mimarisi ve State akışları ile uygulamanızın veri katmanını ve arayüz katmanını mükemmel şekilde ayırabilirsiniz.", "Ali Ç.")
)
