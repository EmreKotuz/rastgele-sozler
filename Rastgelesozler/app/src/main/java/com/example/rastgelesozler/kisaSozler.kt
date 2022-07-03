package com.example.rastgelesozler

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import java.util.*



class kisaSozler : AppCompatActivity() {

    val randommm = arrayListOf(
        "Hayat bir oyunsa bende jeton çok güzelim!"
        ,"Söyleyecek sözü olmayan yüksek sesle konuşur."
        ,"Yanlış bir hayat, asla doğru yaşanmaz."
        ,"Bir kere güldün konu nerelere geldi."
        ,"Hiçbir harfi sensiz bir cümleye kurban etmedim."
        ,"Bir rüyanın gerçeğe dönüştüğü en tatlı halisin."
        ,"Sen gülümseyince reklam arasına giriyor tüm acılar."
        ,"Sen neyi seviyorum desen, o olasım geliyor."
        ,"Pusulası yok yaşadığım hayatın."
        ,"Hayatı yaşanır kılan hayallerdir."
        ,"Hayat, zafer değil, savaştır."
        ,"Hiç bir şey hayat kadar değerli ve kıymetli değildir."
        ,"Hayata dair şeyler sevgiyle başlar, nefretle ölür."
        ,"Hayat bir oyunsa herkes kendi sahnesinde oynar."
        ,"Unutma hayatta hep olduğun kadar varsın."
        ,"Dünden öğren, bugün için yaşa, yarın için umut et."
        ,"Zenginlik, bir bilgenin kölesi, bir aptalın efendisidir."
        ,"Tek bildiğim şey, hiçbir şey bilmediğimdir."
        ,"Zaman asla geri gelmez."
        ,"Gözlerini yıldızlarda, ayaklarını yerde tut."
        ,"Dalgasız deniz asla usta bir denizci yetiştiremez."
        ,"Bugün yap ya da yarın pişman ol."
        ,"Her zaman vazgeçmek için çok erkendir."
        ,"Sessizlik en güçlü çığlıktır."
        ,"Dün düştüysen bugün ayağa kalk."
        ,"Yaşadığın hayatı sev. Sevdiğin hayatı yaşa."
        ,"Ağlama, çünkü bitti; gülümse, çünkü oldu."
        ,"Hayalperesti öldürebilirler ama hayali asla."
        ,"Herkes çıkarken içeri giren kişi gerçek arkadaştır."
        ,"Hayal edebileceğin her şey gerçektir."
        ,"Kalbinizi takip edin ve nereye gideceğini görün."
        ,"Her şeyde bir güzellik vardır, ama herkes bunu göremez."
        ,"Seven bir kalp her zaman gençtir."
        ,"Kusursuz dost arayan dostsuz kalır. "
        ,"Büyük şeyler küçük şeylerin bir araya gelmesidir."
        ,"Her şey, neye layıksa ona dönüşür."
        ,"Kuş ölür, sen uçuşu hatırla."
        ,"Bazen sessizlik çığlık atmak demektir."
        ,"Dün geçti gitti. Yarın belki var, belki yok. Geriye ne kaldı?"
        ,"Susmak noktasız bir cümledir."
        ,"Hiçbir şey boş bir sayfa kadar ilham verici değildir."
        ,"Gençler bilebilse, yaşlılar yapabilse."
        ,"Zaman zaman hiç bilmediğim yerleri özlüyorum. "
        ,"En büyük yalanlar kendimize söylediğimiz yalanlardır."
        ,"İçsiz cevizi hafifliği ele verir."
        ,"Vicdan azabı, kötü şöhretten daha kötüdür."
        ,"Hata değil çare bulun."
        ,"Her eylemin atası düşüncedir."
        ,"Asıl zenginlik az şeye ihtiyaç duymaktır."
        ,"Körler ülkesinde görmek hastalık sayılır."
        ,"En büyük zaman hırsızı kararsızlıktır."
        ,"Her insan ölür ama, her insan gerçekten yaşayamaz."
        ,"İlham en ilginç yerlerde saklanır."
        ,"Her başarı denemeye karar vermekle başlar.")

    val renkRandom = arrayListOf(
        "#fffafa","#faf0e6","#c6e2ff","#97ffff","#e6e6fa","#aaffff")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisa_sozler)
        val degistirr = findViewById<TextView>(R.id.degistir)
        val yazi = findViewById<TextView>(R.id.yaziTahtasi8)
        val copy = findViewById<TextView>(R.id.kopyala)
        val reklam = findViewById<TextView>(R.id.reklam)
        val onizleme = findViewById<Switch>(R.id.onizleme7)
        val arkaPlan = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.durumArkaPlan)
        val altBolum = findViewById<LinearLayout>(R.id.linearLayout)
        val kopya = findViewById<TextView>(R.id.kopyalaOnizleme7)
        val renkButton = findViewById<TextView>(R.id.renkButton7)


        kopya.visibility = View.INVISIBLE

        renkButton.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(renkRandom.count())
            val renkKodu = renkRandom[randomProgram]
            arkaPlan.setBackgroundColor(Color.parseColor(renkKodu))
        }

        onizleme.setOnClickListener {
            if (onizleme.isChecked){
                arkaPlan.setBackgroundColor(Color.parseColor("#eed5d2"))
                altBolum.visibility = View.INVISIBLE
                Toast.makeText(this,"Söz değiştirmek için ekrana tıklayın", Toast.LENGTH_SHORT).show()
                kopya.visibility = View.VISIBLE
                renkButton.visibility = View.VISIBLE
                val randomf = Random()
                val randomArkaPlan = randomf.nextInt(renkRandom.count())
                val renkKodu = renkRandom[randomArkaPlan]
                arkaPlan.setBackgroundColor(Color.parseColor(renkKodu))
                //yazi2.setTextColor(Color.parseColor("#ffffff"))
                arkaPlan.setOnClickListener {
                    val random = Random()
                    val randomProgram = random.nextInt(randommm.count())
                    yazi.text = randommm[randomProgram]
                }
            }else{
                arkaPlan.setBackgroundColor(Color.WHITE)
                kopya.visibility = View.INVISIBLE
                renkButton.visibility = View.INVISIBLE
                altBolum.visibility = View.VISIBLE
                arkaPlan.setOnClickListener {}
                //yazi2.setTextColor(Color.parseColor("#000000"))

            }
        }
        reklam.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.teknoek.com/")
            startActivity(openURL)
        }
        kopya.setOnClickListener{
            copyTextToClipboard()
        }
        copy.setOnClickListener {
            copyTextToClipboard()
        }

        val random = Random()
        val randomProgram = random.nextInt(randommm.count())
        yazi.text = randommm[randomProgram]
        degistirr.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(randommm.count())
            yazi.text = randommm[randomProgram]
        }
    }
    private fun copyTextToClipboard() {
        val yazi2 = findViewById<TextView>(R.id.yaziTahtasi8)
        val textToCopy = yazi2.text
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", textToCopy)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(this, "Kopyalandı", Toast.LENGTH_LONG).show()
    }

}