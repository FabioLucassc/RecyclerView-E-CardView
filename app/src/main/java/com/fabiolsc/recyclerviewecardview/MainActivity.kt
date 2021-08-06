package com.fabiolsc.recyclerviewecardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        updateList()
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
                ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ), Contact(
                        "Fabio Lucas",
                        "(00) 00000-0000",
                        "img.png"
                ), Contact(
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
}