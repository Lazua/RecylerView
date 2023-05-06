package com.praktek.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private lateinit var adapter: ListHeroAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterCard:ListHeroAdapterCard
    private lateinit var adapterGrid:ListHeroAdapterGrid


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rv_hero)

        var data = ArrayList<Hero>()
        data.addAll(HeroesData().listData)

        adapter = ListHeroAdapter(data)
        adapterGrid = ListHeroAdapterGrid(data)
        adapterCard = ListHeroAdapterCard(data)

        rvHeroes.layoutManager = LinearLayoutManager(this)
        rvHeroes.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?):  Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        SetMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun SetMode(selectedMode: Int){
        when(selectedMode){
            R.id.action_list ->{
                Toast.makeText(applicationContext, "List", Toast.LENGTH_SHORT).show()
                rvHeroes.layoutManager = LinearLayoutManager(this)
                rvHeroes.adapter = adapter
            }
            R.id.action_grid ->{
                Toast.makeText(applicationContext, "Grid", Toast.LENGTH_SHORT).show()
                rvHeroes.layoutManager = GridLayoutManager(this,2)
                rvHeroes.adapter = adapterGrid
            }
            R.id.action_cardview -> {
                Toast.makeText(applicationContext, "CardView", Toast.LENGTH_SHORT).show()
                rvHeroes.layoutManager = LinearLayoutManager(this)
                rvHeroes.adapter = adapterCard
            }
        }
    }
}
