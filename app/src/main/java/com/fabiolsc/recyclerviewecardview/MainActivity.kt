package com.fabiolsc.recyclerviewecardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_menu)

        initDrawer()
        bindViews()
        updateList()
    }

    private fun initDrawer() {
        val drawerLayoutManager = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        val toogle = actionBarDrawerToogle(this)
    }

    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        //teste
    }

    private fun updateList() {
        adapter.updateList(
                arrayListOf(
                        Contact(
                                "Fabio Lucas",
                                "(00) 00000-0000",
                                "img.png"
                        ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ))
        )
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu1 -> {
                showToast("Exibindo Item de menu 1")
                return true
            }
            R.id.item_menu2 -> {
                showToast("Exibindo Item de menu 2")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}