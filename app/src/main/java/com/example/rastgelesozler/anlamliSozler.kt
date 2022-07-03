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
import android.widget.*
import java.util.*

val randommm = arrayListOf(
    "Anlamaya çalışma hayat böyledir işte. Hep o kıyamadıklarınız kıyar size."
    ,"Aklı yarda olanın gözü yerde olur."
    ,"Vefa çok ağır yüktür. Her insan taşıyamaz."
    ,"İyi bir ağaca sarılan gölgesiz kalmaz."
    ,"Ya anlasana dargınım ama mahkûmum sana."
    ,"Sus! Hakkımda bilgin yoksa fikrin de olmasın."
    ,"İnsanın öğrenmesi gereken ilk dil tatlı dildir."
    ,"Sen neye nasıl bakarsan o da sana öyle bakar."
    ,"Anlatmak istemiyorum ama anlamanı isterdim."
    ,"Kan bağı neye yarar can bağı olmadıktan sonra."
    ,"Bir rüyanın gerçeğe dönüştüğü en tatlı halisin."
    ,"Hiçbir harfi sensiz bir cümleye kurban etmedim."
    ,"Sen gülümseyince reklam arasına giriyor tüm acılar."
    ,"Bir insan ancak değerini bilenin yanında kıymetlidir."
    ,"Acının şiddetli oluşu değil sürekli oluşu yoruyor bizi."
    ,"Benim en kötü hikâyemi en güvendiğim insanlar yazdı."
    ,"Pahalı parfümleri bir kenara bırakın insan güven kokmalı."
    ,"Onlar sevmeyi yan yana olmak sanıyor."
    ,"Koşarken değil düşerken yanımda olanlar dostumdur."
    ,"Yükün dürüstlükse gücün düşer belki ama başın düşmez."
    ,"En güçlü iki savaşçı sabır ve zamandır."
    ,"Bir rüyanın gerçeğe dönüştüğü en tatlı halisin."
    ,"Anı yazmak ölümün elinden bir şey kurtarmaktır."
    ,"Hiçbir harfi sensiz bir cümleye kurban etmedim."
    ,"Sen benim ilk şiirim ilk kavgam sen benim 17 yaşımsın."
    ,"Sen olmayınca buralar buz gibi. Sensizlik bir iklim adı şimdilerde…"
    ,"Herkes aynı anda yaşar ama herkesin karanlığı farklıdır."
    ,"Olacak gibi değildi, olmadı da zaten…"
    ,"Bir insanın, bir insana verebileceği en güzel hediye; ona ayırabileceği zamandır."
    ,"Çok şükür ki gökyüzü henüz hiçbir cüzdana sığmıyor."
    ,"Aslında bütün insanları sevebilirdim, sevmeye ilk senden başlamasaydım…"
    ,"Ağzında bal olan arının, kuyruğunda iğnesi vardır."
    ,"Ölürsem beni yârimin kalbine gömün. Mekânım cennet olsun."
    ,"Kafamda onlarca ‘SEN’ varken ben hiç yalnız değilim ki."
    ,"Aşk rüzgar gibidir, göremezsin ama hissedebilirsin."
    ,"Bugünün güzel zamanları, yarının üzücü düşünceleridir."
    ,"Cesaret, hayatımızı mükemmel kılan güçtür."
    ,"Olmak istediğin kişinin hayalini kurmak, olduğun kişiyi harcamaktır."
    ,"Soğumak diyorum albayım, bir anlık eylem."
    ,"Canımı yaka yaka, boğazımdaki düğümleri yutkundum."
    ,"Bazen var’ı anlarsınız, yok ile…"
    ,"Alışıyorsunuz zamanla her şeye ama asla bitmiyor."
    ,"Seven insan iki eli kanda bile olsa yine gelir, bahaneler üretmez"
    ,"Şu dünyadaki en büyük jüri el âlemdir."
    ,"İnsanı en çok yıpratan şey iyi niyetlidir.")

    val renkRandom = arrayListOf(
        "#fffafa","#faf0e6","#c6e2ff","#97ffff","#e6e6fa","#aaffff")

class anlamliSozler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anlamli_sozler)

        val degistirr5 = findViewById<TextView>(R.id.degistir)
        val yazi5 = findViewById<TextView>(R.id.yaziTahtasi2)
        val copy5 = findViewById<TextView>(R.id.kopyala)
        val reklam= findViewById<TextView>(R.id.reklam)
        val onizleme = findViewById<Switch>(R.id.onizleme3)
        val arkaPlan = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.durumArkaPlan)
        val altBolum = findViewById<LinearLayout>(R.id.linearLayout)
        val kopya = findViewById<TextView>(R.id.kopyalaOnizleme3)
        val renkButton = findViewById<TextView>(R.id.renkButton3)


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
                Toast.makeText(this,"Söz değiştirmek için ekrana tıklayın",Toast.LENGTH_SHORT).show()
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
                    yazi5.text = randommm[randomProgram]
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
        copy5.setOnClickListener {
            copyTextToClipboard()
        }

        //random sözler
        val random = Random()
        val randomProgram = random.nextInt(randommm.count())
        yazi5.text = randommm[randomProgram]
        degistirr5.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(randommm.count())
            yazi5.text = randommm[randomProgram]
        }
    }
    private fun copyTextToClipboard() {
        val yazi2 = findViewById<TextView>(R.id.yaziTahtasi2)
        val textToCopy = yazi2.text
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", textToCopy)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(this, "Kopyalandı", Toast.LENGTH_LONG).show()
    }

}