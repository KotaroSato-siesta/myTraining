package com.example.mytraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        val menuList: MutableList<MutableMap<String, String>> = mutableListOf()

        menuList.add(mutableMapOf("name" to "Day1", "part" to "胸・肩・上腕三頭筋"))
        menuList.add(mutableMapOf("name" to "Day2", "part" to "背中・上腕二頭筋・三角筋後部"))
        menuList.add(mutableMapOf("name" to "Day3", "part" to "下半身"))

        val from = arrayOf("name", "part")
        val to = intArrayOf(android.R.id.text1, android.R.id.text2)
        val adapter = SimpleAdapter(this@MainActivity, menuList, android.R.layout.simple_list_item_2, from, to)

        lvMenu.adapter = adapter
        lvMenu.onItemClickListener = ListItemClickListener()
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val item = parent.getItemAtPosition(position) as MutableMap<String, String>

            val menuName = item["name"]
            val menuPart = item["part"]

            val intent2Menu = Intent(this@MainActivity, SubActivity::class.java)

            intent2Menu.putExtra("name", menuName)
            intent2Menu.putExtra("part", menuPart)

            startActivity(intent2Menu)
        }
    }
}