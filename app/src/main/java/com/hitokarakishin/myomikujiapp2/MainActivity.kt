package com.hitokarakishin.myomikujiapp2

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hitokarakishin.myomikujiapp2.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.text.Html

//import sun.jvm.hotspot.utilities.IntArray
//import android.R



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //JavaのArray
//            val abcArr = arrayOf(arrayOf("abc", "def"), arrayOf<String>("ghi", "jkl"))
//
//            abcArr.forEach {
//                it.forEach {
//                    print("${it} ")
//                }
//                println()
//            }

//            Log.v("MainActivity", "Button Clicked")
//            val n = Random().nextInt(3)

        //ドットインストール版
        getOmikujiButton.setOnClickListener {
            val results = arrayOf(
                "1位",
                "2位",
                "3位",
                "4位",
                "5位",
                "6位",
                "7位",
                "8位",
                "9位",
                "10位",
                "11位",
                "12位",
                "13位",
                "14位",
                "15位",
                "16位",
                "17位",
                "18位",
                "19位",
                "20位",
                "21位",
                "22位",
                "23位",
                "24位",
                "25位",
                "26位",
                "27位"
//                "1位 大大吉",
//                "2位 大吉",
//                "3位 凶後大吉\n<small>（きょう のち だいきち）</small>",
//                "4位 凶後吉\n（きょう のち きち）",
//                "5位 末大吉",
//                "6位 向大吉\n（むこう だいきち）\n※これから良いことが起きる",
//                "7位 吉",
//                "8位 中吉",
//                "9位 小吉",
//                "10位 半吉",
//                "11位 末小吉",
//                "12位 末吉",
//                "13位 小凶後吉\n（しょうきょう のち きち）",
//                "14位 後吉\n（あときち）\n※これから良いことが起きる",
//                "15位 吉凶未分末大吉\n（よしあし いまだわからず すえだいきち）\n※まだ分からないが、後から良くなる",
//                "16位 吉凶不分末吉\n（きちきょう わかたず すえきち）\n※まだ分からないが、後から良くなる",
//                "17位 吉凶相半\n（きちきょう あいまじわり すえきち）\n※いいときもあれば、悪いときもある",
//                "18位 吉凶相交末吉\n（きちきょう あいまじわり すえきち）\n※今はいいときもあれば悪いときもあるが、後から少しよくなる",
//                "19位 吉凶相央\n（きちきょう あいなかばす）\n※いいときもあれば、悪いときもある",
//                "20位 平\n（たいら）\n※可もなく不可もなくという意味",
//                "21位 半凶",
//                "22位 凶",
//                "23位 小凶",
//                "24位 中凶",
//                "25位 末凶",
//                "26位 大凶",
//                "27位 大大凶"
            )

            val n = Random().nextInt(results.count())

            //yomiTextView
            val resultsYomi = arrayOf(
                "だいだいきち",
                "だいきち",
                "きょう のち だいきち",
                "きょう のち きち",
                "すえだいきち",
                "むこう だいきち",
                "きち",
                "ちゅうきち",
                "しょうきち",
                "はんきち",
                "すえしょうきち",
                "すえきち",
                "しょうきょう のち きち",
                "あときち",
                "よしあし いまだわからず すえだいきち",
                "きちきょう わかたず すえきち",
                "きちきょう あいまじわり すえきち",
                "きちきょう あいまじわり すえきち",
                "きちきょう あいなかばす",
                "たいら",
                "はんきょう",
                "きょう",
                "しょうきょう",
                "ちゅうきょう",
                "すえきょう",
                "だいきょう",
                "だいだいきょう"
//                "1","2","3","4","5","6","7","8","9","10",
//                "11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"
            )
            val nYomi: Int = n
            yomiTextView.text = resultsYomi.get(nYomi)

            //unTextview
            val resultsUn = arrayOf(
                "大大吉",
                "大吉",
                "凶後大吉",
                "凶後吉",
                "末大吉",
                "向大吉",
                "吉",
                "中吉",
                "小吉",
                "半吉",
                "末小吉",
                "末吉",
                "小凶後吉",
                "後吉",
                "吉凶未分末大吉",
                "吉凶不分末吉",
                "吉凶相半",
                "吉凶相交末吉",
                "吉凶相央",
                "平",
                "半凶",
                "凶",
                "小凶",
                "中凶",
                "末凶",
                "大凶",
                "大大凶"
            )
            val nUn: Int = n
            unTextView.text = resultsUn.get(nUn)

            //imiTextview
            val resultsImi = arrayOf(
                "最上級にすごくいいことが起きる",
                "すごくいいことが起きる",
                "今はよくないが、\n後からすごくいいことが起きる",
                "今はよくないが、\n後からいいことが起きる",
                "かろうじてすごくいいことが起きる",
                "これからすごくいいことが起きる",
                "いいことが起きる",
                "ある程度いいことが起きる",
                "少しいいことが起きる",
                "欠けていることもあるが、\n少しいいことが起きる",
                "かろうじて少しいいことが起きる",
                "かろうじてわずかにいいことが起きる",
                "すこしよくないが、\n後からいいことが起きる",
                "今はよくも悪くもないが、\n後からいいことが起きる",
                "まだ分からないが、\n後からすごくいいことが起きる",
                "まだ分からないが、\n後からいいことが起きる",
                "いいことが起きるときもあれば、\nよくないことが起きるときもある",
                "いいことが起きるときもあれば、\nよくないことが起きるときもあるが、\n後からかろうじてわずかにいいことが起きる",
                "いいことが起きるときもあれば、\nよくないことが起きるときもあるがどちらとも言えない",
                "可もなく不可もなし",
                "大したことはないが、\n少しよくないことが起きる",
                "よくないことが起きる",
                "少しよくないことが起きる",
                "ある程度よくないことが起きる",
                "かなりよくないことが起きる",
                "すごくよくないことが起きる",
                "最上級にすごくよくないことが起きる"
            )
            val nImi: Int = n
            imiTextView.text = resultsImi.get(nImi)

            if (n == 0){
//                resultTextView.setTextColor(Color.RED)
//                resultTextView.setTextColor(Color.parseColor("#ff0000"))
                resultTextView.setTextColor(Color.argb(255,255,0,0))
                yomiTextView.setTextColor(Color.argb(255,255,0,0))
                unTextView.setTextColor(Color.argb(255,255,0,0))
            }else if(n == 26){
                resultTextView.setTextColor(Color.BLUE)
                yomiTextView.setTextColor(Color.BLUE)
                unTextView.setTextColor(Color.BLUE)
            }else{
                resultTextView.setTextColor(Color.parseColor("#808080"))
                yomiTextView.setTextColor(Color.parseColor("#808080"))
                unTextView.setTextColor(Color.parseColor("#808080"))
            }
            resultTextView.text = results.get(n)

        }

        urlButton.setOnClickListener {
            val uri = Uri.parse("https://will-kishin.com/4351/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }
}
