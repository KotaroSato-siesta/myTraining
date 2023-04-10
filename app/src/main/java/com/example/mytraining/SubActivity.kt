package com.example.mytraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val menuName = intent.getStringExtra("name")
        val menuPart = intent.getStringExtra("part")

        val lvTraining = findViewById<ListView>(R.id.lvTraining)

        val day1Menu: MutableList<MutableMap<String, String>> = mutableListOf()
        val day2Menu: MutableList<MutableMap<String, String>> = mutableListOf()
        val day3Menu: MutableList<MutableMap<String, String>> = mutableListOf()

        day1Menu.add(mutableMapOf("name" to "ベンチプレス−１", "volume" to "６〜８回×２セット"))
        day1Menu.add(mutableMapOf("name" to "ベンチプレス−２", "volume" to "１０〜１５回×２セット"))
        day1Menu.add(mutableMapOf("name" to "インクラインダンベルフライ", "volume" to "８〜１２回×３セット"))
        day1Menu.add(mutableMapOf("name" to "チェストプレス", "volume" to "１０〜１４回×４セット"))
        day1Menu.add(mutableMapOf("name" to "ショルダープレス", "volume" to "８〜１２回×３セット"))
        day1Menu.add(mutableMapOf("name" to "サイドレイズ", "volume" to "１０〜２５回×３セット"))
        day1Menu.add(mutableMapOf("name" to "ケーブルアップライトロウ", "volume" to "１０〜１５回×３セット"))
        day1Menu.add(mutableMapOf("name" to "クロースグリップベンチプレス", "volume" to "８〜１２回×３セット"))
        day1Menu.add(mutableMapOf("name" to "ロープトライセプスエクステンション", "volume" to "１０〜１５回×３セット"))

        day2Menu.add(mutableMapOf("name" to "アシストチンニング", "volume" to "８〜１２回×３セット"))
        day2Menu.add(mutableMapOf("name" to "ラットプルダウン", "volume" to "１０〜１５回×３セット"))
        day2Menu.add(mutableMapOf("name" to "マシンロウイング", "volume" to "８〜１５回×３セット"))
        day2Menu.add(mutableMapOf("name" to "ケーブルロウイング", "volume" to "１０〜３０回×３セット"))
        day2Menu.add(mutableMapOf("name" to "Vバーロウイング", "volume" to "８〜１２回×３セット"))
        day2Menu.add(mutableMapOf("name" to "EZバーケーブルカール", "volume" to "１５〜２０回×３セット"))
        day2Menu.add(mutableMapOf("name" to "インクラインカール", "volume" to "１０〜１５回×３セット"))
        day2Menu.add(mutableMapOf("name" to "リアデルトフライ", "volume" to "１０〜１５回×３セット"))

        day3Menu.add(mutableMapOf("name" to "４５度レッグプレス", "volume" to "１０〜１５回×３セット"))
        day3Menu.add(mutableMapOf("name" to "シーテッドレッグプレス", "volume" to "１０〜１５回×３セット"))
        day3Menu.add(mutableMapOf("name" to "レッグエクステンション", "volume" to "１０〜１５回×３セット"))
        day3Menu.add(mutableMapOf("name" to "レッグカール", "volume" to "８〜１２回×３セット"))
        day3Menu.add(mutableMapOf("name" to "デッドリフト", "volume" to "８〜１２回×３セット"))

        val from = arrayOf("name", "volume")
        val to = intArrayOf(android.R.id.text1, android.R.id.text2)

        when(menuName) {
            "Day1" -> {
                var adapter = SimpleAdapter(this@SubActivity, day1Menu, android.R.layout.simple_list_item_2, from, to)
                lvTraining.adapter = adapter

                val toast = Toast.makeText(applicationContext, "switch 1", Toast.LENGTH_LONG)
                toast.show()
            }
            "Day2" -> {
                var adapter = SimpleAdapter(this@SubActivity, day2Menu, android.R.layout.simple_list_item_2, from, to)
                lvTraining.adapter = adapter

                val toast = Toast.makeText(applicationContext, "switch 2", Toast.LENGTH_LONG)
                toast.show()
            }
            "Day3" -> {
                var adapter = SimpleAdapter(this@SubActivity, day3Menu, android.R.layout.simple_list_item_2, from, to)
                lvTraining.adapter = adapter

                val toast = Toast.makeText(applicationContext, "switch 3", Toast.LENGTH_LONG)
                toast.show()
            }
        }
    }
}