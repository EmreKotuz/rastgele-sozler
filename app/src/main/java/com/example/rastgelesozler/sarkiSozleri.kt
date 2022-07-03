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

class sarkiSozleri : AppCompatActivity() {
    val randommm = arrayListOf(
        "Sana tutunmaya çalışan ben, beni tutmayıp düşüren sen… - Sagopa Kajmer"
        ,"Boğulmaktan korktuğun denizim, tahmininden derinim… - Sagopa Kajmer"
        ,"Sevgi mi? Artık kamyon ardı yazılarda. - Taladro"
        ,"Ne bir eksik ne bir fazla canımsın sen. - Sezen Aksu"
        ,"Bana huzur veren tek kadın alakamdan bıkkın. - Canfeza"
        ,"Sürekli kaybettim çünkü, iyi kalpli içimde ki gerizekalı. - Şanışer"
        ,"Dünyalar sizin olsun, benim istediğim bambaşka. - Cem Adrian"
        ,"Sen bana nefes, ben sana herkes. - Emircan İğrek"
        ,"Zira yeterince katlandım insanlara. - Şehinşah"
        ,"Elimden gittin, ama içimden geliyorsun. - Canfeza"
        ,"Birden ay ışığını kesti, bir de sen çok değiştin. - Manga"
        ,"Bugün kötü oluyor dün sevilenler. - Taladro"
        ,"Haddinden dolu yorgunum. - Taladro"
        ,"Parmak uçlarında yürü hatıralar uyanmasın. - Alper Ayyıldız"
        ,"Yine herkesi kendim sandım. - Sancak"
        ,"Yok olunca mı özleyeceksin beni. - No.1"
        ,"Seni ben gibi sevmiyorum canım buna sıkkın. - Canfeza "
        ,"Bana boş laf anlatma kalbin taşa dönmüş senin. - Norm Ender"
        ,"Ona da herşeyim demişsin bana ne kaldı? - Model"
        ,"Lütfen kalbini aç, eve dönüyorum. - Şanışer"
        ,"Omuzumda iz bırakma,yüküm dünyaya yakın. - Haluk Levent"
        ,"Yıkadıkça geçmiyor, anıların izleri - Tuğçe Kandemir"
        ,"Trilyonda olsan, harcanacaksın! - Sagopa Kajmer"
        ,"Vedaların sonu yok. Evvelimde sen, ahirimde sen yok… - İntizam"
        ,"Sen bir uçurtmasın, bende senin ipinim unutmayasın… - Sagopa Kajmer"
        ,"Hissetmiyorum artık, bu sabır değil…Tamamen duyarsızlık. - Alper Ayyıldız"
        ,"Aşk; ağlatan bir şarkı, yada ömr-ü billah beklemek… - Vale"
        ,"Bin “günahın” olsa da bana, bir “gün ahım” yok sana… - N.F.K."
        ,"Aldığımız nefesi bile geri veriyorsak, hiçbir şey bizim değil. - N.F.K."
        ,"Derdi veren, çözümünü unutur mu asla? - Sagopa Kajmer"
        ,"Korkma, öldürmez seni aşk… - Alper Ayyıldız")

    val renkRandom = arrayListOf(
        "#fffafa","#faf0e6","#c6e2ff","#97ffff","#e6e6fa","#aaffff")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sarki_sozleri)

        val degistirr3 = findViewById<TextView>(R.id.degistir)
        val yazi3 = findViewById<TextView>(R.id.yaziTahtasi4)
        val copy3 = findViewById<TextView>(R.id.kopyala)
        val reklam= findViewById<TextView>(R.id.reklam)
        val onizleme = findViewById<Switch>(R.id.onizleme4)
        val arkaPlan = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.durumArkaPlan)
        val altBolum = findViewById<LinearLayout>(R.id.linearLayout)
        val kopya = findViewById<TextView>(R.id.kopyalaOnizleme4)
        val renkButton = findViewById<TextView>(R.id.renkButton4)


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
                    yazi3.text = randommm[randomProgram]
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
        copy3.setOnClickListener {
            copyTextToClipboard()
        }

        //random sözler
        val random = Random()
        val randomProgram = random.nextInt(randommm.count())
        yazi3.text = randommm[randomProgram]
        degistirr3.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(randommm.count())
            yazi3.text = randommm[randomProgram]
        }
    }
    private fun copyTextToClipboard() {
        val yazi2 = findViewById<TextView>(R.id.yaziTahtasi4)
        val textToCopy = yazi2.text
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", textToCopy)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(this, "Kopyalandı", Toast.LENGTH_LONG).show()
    }

}