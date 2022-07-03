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
import androidx.core.view.marginBottom
import java.util.*



class durumsozleri : AppCompatActivity() {
    //private var mAdView: AdView? = null

    val randommm = arrayListOf(
        "Her zaman seninleyim dediğin gün bile yanımda yoktun…"
        ,"Kinim yoktur, affederim. Ama hiç bir zaman eskisi gibi oImam."
        ,"Hayat güzel sanmıştım. Meğerse. Kafam güzelmiş."
        ,"İnsanlar yaşamaya devam edecek, bazıIarı da öImeye."
        ,"Tek ihtiyacım neydi biIiyor musun? Bir papatya yaprağı daha…"
        ,"Tamam tamam adımla seslensen de olur."
        ,"Kiviye patates diyen insansın ne ara sosyetik oldun sen…"
        ,"Ya farkıma vardığında, farkın kaImamış olursa?"
        ,"Eğer kaderinse, bütün dünya karşı da gelse kavuşursunuz."
        ,"İnsanlar değişir, en güvendiğin bile."
        ,"Kıramadığım kalpler beni korkak sandı."
        ,"Zaten hayal kırıklığına bağışıklık kazanmış insanlarız."
        ,"Ben bir yolunu bulurum, hep bulmuştum."
        ,"İnsanlardan korkarım ben; kalbi, vicdanı, adaleti olmayan insanlardan."
        ,"Cam kırıkları gibidir bazen kelimeler, ağzına dolar insanın, sussan acıtır, konuşsan kanatır."
        ,"Beni çıkardığında anlamın bozulmuyorsa bundan böyle ayrı yazılalım."
        ,"İnsan geçmişine dönüp bakınca kendinden özür dilemek istiyor."
        ,"Sadece hayallerim yıkıldı, duruşumda bir sıkıntı yok.."
        ,"Çok gereksiz insanlara açtık kalbimizi.."
        ,"Ama her yaptığımda mantık ararsanız ilerleyemeyiz."
        ,"İyi biriyim ama herkese değil."
        ,"Kimse durduk yere tahammülsüz biri olmuyor."
        ,"Bazı insanlar, bazı insanlara hediyedir."
        ,"Kırdığın kalbin sahibine iyi bak. Yolun bir gün muhakkak ona çıkacak."
        ,"Siz nasıl rol yaparsanız, bende öyle senaryo yazarım. Sıkıntı yok."
        ,"Bağlanmaktan korkuyorum dedi. Tasmasını çıkardım gitti."
        ,"Aklımdan çıkmıyor! Aklım çıkıyor ama o çıkmıyor."
        ,"Bugün yap ya da yarın pişman ol!"
        ,"Geldiğin yeri kafandan çıkarırsan, gideceğin yerde perişan olursun."
        ,"Zaman unutturmaz, uyuşturur."
        ,"Allah seni özgür yaratmış! Gidip başkasının kölesi olma."
        ,"Alnımdan öp ki oraya adın yazılsın."
        ,"Aşk, yorgunken bile seni güldüren şeydir."
        ,"Ağlamak belki kirpikleri ıslatır ama kalbi temizler."
        ,"Zamanın silemediği o kadar çok şey var ki…"
        ,"Zekânın peşinden koşmayın! Aptallığı yakalarsınız."
        ,"Kadın gökyüzü, adam renk körü."
        ,"Tanımıyorsan beni uzaktan yargılama!"
        ,"Yazıyorum ama sana değil…"
        ,"Benim adamlığım senin terazine fazla gelir!"
        ,"Ben PTT değilim çok fazla yazmayın…"
        ,"Yaz bana mavi olalım."
        ,"Umutlar başka bahara.."
        ,"Hiç kimse senin kadar fikrime huzur değil…"
        ,"Yalnızlığım; hayatımın tek sırdaşı…"
        ,"Sensizlik istememiştim."
        ,"Bende duran zaman sende nasıl geçiyor?"
        ,"Gelmesen önemli değil, gelsen önemli olurdu."
        ,"Bu yalnızlık benim ilişmeyin…"
        ,"Yorulmuşsun, hakkını almış yılların.")

    val renkRandom = arrayListOf(
        "#fffafa","#faf0e6","#c6e2ff","#97ffff","#e6e6fa","#aaffff")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_durumsozleri)
        val degistirr2 = findViewById<TextView>(R.id.degistir)
        val yazi2 = findViewById<TextView>(R.id.yaziTahtasi3)
        val copy2 = findViewById<TextView>(R.id.kopyala)
        val reklam= findViewById<TextView>(R.id.reklam)
        val onizleme = findViewById<Switch>(R.id.onizleme)
        val arkaPlan = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.durumArkaPlan)
        val altBolum = findViewById<LinearLayout>(R.id.linearLayout)
        val kopya = findViewById<TextView>(R.id.kopyalaOnizleme)
        val renkButton = findViewById<TextView>(R.id.renkButton)


        /*
        MobileAds.initialize(this, "\n" + "ca-app-pub-6537190103014639~1020397464")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView!!.loadAd(adRequest)


        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        adView.adUnitId = "ca-app-pub-6537190103014639/4128942386"

        mAdView!!.adListener = object : AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(errorCode: Int) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
            }
        }
         */

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
                    yazi2.text = randommm[randomProgram]
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
        copy2.setOnClickListener {
            copyTextToClipboard()
        }



        //random sözler
        val random = Random()
        val randomProgram = random.nextInt(randommm.count())
        yazi2.text = randommm[randomProgram]
        degistirr2.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(randommm.count())
            yazi2.text = randommm[randomProgram]
        }
    }
    private fun copyTextToClipboard() {
        val yazi2 = findViewById<TextView>(R.id.yaziTahtasi3)
        val textToCopy = yazi2.text
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", textToCopy)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(this, "Kopyalandı", Toast.LENGTH_LONG).show()
    }

}