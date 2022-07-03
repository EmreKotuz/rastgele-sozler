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

class agirSozler : AppCompatActivity() {
    val randommm = arrayListOf(
        "Yanımda olan kabalığı gördüğüm an içlerini de dolu sanmıştım. Kısmetim, bereketimi kapatmış olduklarını çok ama çok geç anladım."
        ,"Yiğitlik öyle herkese yakışmaz. Yiğitlik, yürek işidir. Bu yüzden de her kişide bulunan bir şey değildir."
        ,"Soytarılar eğlendirir fakat kazara da olsa kralın tahtını sallandırabilirler. Fakat gerçek bir kralsa hiçbir zaman tahtını sallandırmaz ve yıkılamaz"
        ,"Büyük hayaller kurmak iyidir. Fakat uykunuz da büyükse hayalleriniz asla gün ışığı görmeyecektir. Günaydın …"
        ,"Çok düşmanımın olmasının benim için pek bir önemi yok. Adam gibi düşman olsun, benim için asıl bu önemlidir."
        ,"Şeref ve karakter senin kadar ucuz olsa onu da vereseye yazdırabileceğinin farkındayım."
        ,"Boşuna benim üzerime planlar yapmayın. Tüm planınızı bozarım ve merkezine de sizi koyarım."
        ,"Adam olmayana adamlığım koyuyorsa eğer hiç şüphesiz devam ederek benim krallığımda yürüyeceksiniz."
        ,"Yalnızca cebinde olan ile karakter olduğunu sanan kişilere sözüm var. Ruhsuz olan heykellerde para ile yapılmakta."
        ,"Akıllı olduğunu sanan kişiler, aklını yalnızca eleştirmek ile kullanmakta, geliştirmekte değillerdir."
        ,"İnsanlık olan elbiseyi giyemeyen zavallı kişiler, üzerlerine ne giyseler daima çıplak bir şekilde kalırlar."
        ,"Kahpelik için bahane aramanıza gerek yoktur. En kestirme yolundan kabul etmeyi göze alın."
        ,"Benim sahnemde fragmanlar şuanda bitti, asıl sahne yeni başlıyor. Hazırlıklı olun!"
        ,"Kendini ulaşılmaz sanabilirsin fakat ulaşılmaz olduğundan değil, uğraşılmaz olduğun için savaşamam seninle!"
        ,"Şeref ve karakter senin kadar ucuz olsa onu da vereseye yazdırabileceğinin farkındayım."
        ,"Yaptıklarıyla küçülenler laflarıyla büyüdüklerini sanmasın."
        ,"Bazı insan girdiğinde odayı aydınlatır bazısı da çıktığında."
        ,"Her insan kendine yakışanı yapar. Çünkü kalite asla tesadüf değildir."
        ,"Adam olmayana düşman bile olmam."
        ,"İnsanlık olan elbiseyi giyemeyen zavallı kişiler, üzerlerine ne giyseler daima çıplak bir şekilde kalırlar."
        ,"Sebeplerimi bilmiyorsan seçimlerimi yargılama."
        ,"Ben adam yerine koyuyorum o yerini beğenmiyor."
        ,"İhanetin telafisi kahpeliğin bahanesi olmaz."
        ,"Seni unutmak zor değil gülüm yokluğun bana lütuf oldu"
        ,"Hiçbir konuda bir bilgin olmadığı halde haddini de bilmiyorsun"
        ,"Keşke demeden önce yaptığını bir daha düşün belki bir kalp kırmışsındır"
        ,"Ağlarken yanımda olmayan gülerken tebessüm bile etmesin"
        ,"Eskiden kafama çok takardım baktım benim gülüşlerim millete toka olmuş"
        ,"Hayallerimi değersiz insanlara anlattım. Hayallerim ziyan oldu"
        ,"Dertlerimiz büyük olduğu için dağlar bize küçük geldi"
        ,"Serseriler dünyada hüküm süremez serserilik basit adam olmak zordur."
        ,"Biraz insanlık öğrenin dediklerim konuşmayı bile unuttu"
        ,"Herkesin derdi var fakat bizim dertler herkes olmuş"
        ,"Ortamlarda yaşı büyük olana değil, karakteri sağlam olana abi deniyor."
        ,"Herkesin bir yarası var. Gece kadar karanlık, okyanus kadar derin."
        ,"Adam olmayana adamlık yapmak her zaman çok zor gelir."
        ,"Adil dövüşenlerin her zaman kaybedenler olduğunu asla unutma."
        ,"Erkek adam ise kadın her zaman hanımefendidir."
        ,"Ben sevda konusunda iki arada kalmam. Ya sevmişimdir ya da silmişimdir."
        ,"Aşk kadına yakışır. Adam gibi sevmek adama."
        ,"İnsanlar bizim durumlarımızı değil adamlığımızı beğeniyor."
        ,"Sevmekten anlamayan bile aşk acısından bahseder oldu."
        ,"Düşmanım olabilmen içinde duruşunun olması gerek bunu unutmayın.")

    val renkRandom = arrayListOf(
        "#fffafa","#faf0e6","#c6e2ff","#97ffff","#e6e6fa","#aaffff")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agir_sozler)
        val degistirr = findViewById<TextView>(R.id.degistir)
        val yazi = findViewById<TextView>(R.id.yaziTahtasi)
        val copy = findViewById<TextView>(R.id.kopyala)
        val reklam = findViewById<TextView>(R.id.reklam)
        val onizleme = findViewById<Switch>(R.id.onizleme2)
        val arkaPlan = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.durumArkaPlan)
        val altBolum = findViewById<LinearLayout>(R.id.linearLayout)
        val kopya = findViewById<TextView>(R.id.kopyalaOnizleme2)
        val renkButton = findViewById<TextView>(R.id.renkButton2)


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

        //random sözler
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
        val yazi2 = findViewById<TextView>(R.id.yaziTahtasi)
        val textToCopy = yazi2.text
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", textToCopy)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(this, "Kopyalandı", Toast.LENGTH_LONG).show()
    }

}