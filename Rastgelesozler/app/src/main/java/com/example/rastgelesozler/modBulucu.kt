package com.example.rastgelesozler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import java.util.*

class modBulucu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //ruh hali 1 söz ağırlığı ŞEKERLEME
        val ruh1sozseker = arrayListOf(
            "Yanımda olan kabalığı gördüğüm an içlerini de dolu sanmıştım. Kısmetim, bereketimi kapatmış olduklarını çok ama çok geç anladım.",
            "Yiğitlik öyle herkese yakışmaz. Yiğitlik, yürek işidir. Bu yüzden de her kişide bulunan bir şey değildir.",
            "Soytarılar eğlendirir fakat kazara da olsa kralın tahtını sallandırabilirler. Fakat gerçek bir kralsa hiçbir zaman tahtını sallandırmaz ve yıkılamaz",
            "Büyük hayaller kurmak iyidir. Fakat uykunuz da büyükse hayalleriniz asla gün ışığı görmeyecektir. Günaydın …",
            "Çok düşmanımın olmasının benim için pek bir önemi yok. Adam gibi düşman olsun, benim için asıl bu önemlidir.",
            "Şeref ve karakter senin kadar ucuz olsa onu da vereseye yazdırabileceğinin farkındayım.",
            "Boşuna benim üzerime planlar yapmayın. Tüm planınızı bozarım ve merkezine de sizi koyarım.",
            "Adam olmayana adamlığım koyuyorsa eğer hiç şüphesiz devam ederek benim krallığımda yürüyeceksiniz.",
            "Yalnızca cebinde olan ile karakter olduğunu sanan kişilere sözüm var. Ruhsuz olan heykellerde para ile yapılmakta.",
            "Akıllı olduğunu sanan kişiler, aklını yalnızca eleştirmek ile kullanmakta, geliştirmekte değillerdir.",
            "İnsanlık olan elbiseyi giyemeyen zavallı kişiler, üzerlerine ne giyseler daima çıplak bir şekilde kalırlar.",
            "Kahpelik için bahane aramanıza gerek yoktur. En kestirme yolundan kabul etmeyi göze alın.",
            "Benim sahnemde fragmanlar şuanda bitti, asıl sahne yeni başlıyor. Hazırlıklı olun!",
            "Kendini ulaşılmaz sanabilirsin fakat ulaşılmaz olduğundan değil, uğraşılmaz olduğun için savaşamam seninle!",
            "Şeref ve karakter senin kadar ucuz olsa onu da vereseye yazdırabileceğinin farkındayım.",
            "Yaptıklarıyla küçülenler laflarıyla büyüdüklerini sanmasın.",
            "Bazı insan girdiğinde odayı aydınlatır bazısı da çıktığında.",
            "Her insan kendine yakışanı yapar. Çünkü kalite asla tesadüf değildir.",
            "Adam olmayana düşman bile olmam.",
            "İnsanlık olan elbiseyi giyemeyen zavallı kişiler, üzerlerine ne giyseler daima çıplak bir şekilde kalırlar.",
            "Sebeplerimi bilmiyorsan seçimlerimi yargılama.",
            "Ben adam yerine koyuyorum o yerini beğenmiyor.",
            "İhanetin telafisi kahpeliğin bahanesi olmaz.",
            "Seni unutmak zor değil gülüm yokluğun bana lütuf oldu",
            "Hiçbir konuda bir bilgin olmadığı halde haddini de bilmiyorsun",
            "Keşke demeden önce yaptığını bir daha düşün belki bir kalp kırmışsındır",
            "Ağlarken yanımda olmayan gülerken tebessüm bile etmesin",
            "Eskiden kafama çok takardım baktım benim gülüşlerim millete toka olmuş",
            "Hayallerimi değersiz insanlara anlattım. Hayallerim ziyan oldu",
            "Dertlerimiz büyük olduğu için dağlar bize küçük geldi",
            "Serseriler dünyada hüküm süremez serserilik basit adam olmak zordur.",
            "Biraz insanlık öğrenin dediklerim konuşmayı bile unuttu",
            "Herkesin derdi var fakat bizim dertler herkes olmuş",
            "Ortamlarda yaşı büyük olana değil, karakteri sağlam olana abi deniyor.",
            "Herkesin bir yarası var. Gece kadar karanlık, okyanus kadar derin.",
            "Adam olmayana adamlık yapmak her zaman çok zor gelir.",
            "Adil dövüşenlerin her zaman kaybedenler olduğunu asla unutma.",
            "Erkek adam ise kadın her zaman hanımefendidir.",
            "Ben sevda konusunda iki arada kalmam. Ya sevmişimdir ya da silmişimdir.",
            "Aşk kadına yakışır. Adam gibi sevmek adama.",
            "İnsanlar bizim durumlarımızı değil adamlığımızı beğeniyor.",
            "Sevmekten anlamayan bile aşk acısından bahseder oldu.",
            "Düşmanım olabilmen içinde duruşunun olması gerek bunu unutmayın."
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mod_bulucu)

        val hizBarr = findViewById<SeekBar>(R.id.hizBar)
        var hizText = findViewById<TextView>(R.id.hizText)
        val hizBarr2 = findViewById<SeekBar>(R.id.hizBar2)
        var hizText2 = findViewById<TextView>(R.id.hizText2)
        var algoritma = findViewById<Button>(R.id.algoritmaButton)
        var yaz = findViewById<TextView>(R.id.yazdir)
        hizBarr.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                var i = p1.toString().toInt()
                hizText.text = (i / 20).toString()
            }


            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
        hizBarr2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                var ii = ((p1.toString().toInt()) / 25).toString()
                if (ii.toInt() == 1) {
                    hizText2.text = "Şekerleme+"
                } else if (ii.toInt() == 2) {
                    hizText2.text = "Hafif"
                } else if (ii.toInt() == 3) {
                    hizText2.text = "Orta"
                } else if (ii.toInt() == 4) {
                    hizText2.text = "Şiddetli"
                } else {
                    hizText2.text = "Şekerleme"
                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {

            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (hizText.text == "0"){hizText.text = "1"}
                if (hizText.text == "1") {
                    if (hizText2.text == "Şekerleme") {

                    } else if (hizText2.text == "Şekerleme+") {

                    } else if (hizText2.text == "Hafif") {
                        algoritma.setOnClickListener {
                            val random = Random()
                            val randomProgram = random.nextInt(ruh1sozseker.count())
                            yaz.text = ruh1sozseker[randomProgram]
                        }
                    } else if (hizText2.text == "Orta") {
                        yaz.text = "ruh 1, ağırlık Orta+"
                    } else if (hizText2.text == "Şiddetli") {
                        yaz.text = "ruh 1, ağırlık Şiddetli+"
                    }else {
                        yaz.text = "Şekerleme"
                    }
                }
                else if (hizText.text == "2")
                {
                    if (hizText2.text == "Orta") {
                        yaz.text = "ruh 2, ağırlık Orta+"
                    }
                }
                else if (hizText.text == "3")
                {

                }
                else if (hizText.text == "4")
                {

                }
                else if (hizText.text == "5")
                {

                }
                else
                {

                }
            }
        })

    }
}