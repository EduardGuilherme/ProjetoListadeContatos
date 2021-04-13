package com.example.projectlistadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvlist:RecyclerView by lazy {
        findViewById(R.id.rv_list)
    }
    private val adapter=ContactAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindview()
        updateList()
    }
    private fun bindview(){
        rvlist.adapter = adapter
        rvlist.layoutManager=LinearLayoutManager(this)
    }
    private fun updateList(){
        adapter.updateList(
                arrayListOf(
                        Contact(
                                "Eduardo",
                                "999999999",
                                "img.jpg"
                        ),
                        Contact(
                                "Eduardo",
                                "999999999",
                                "img.jpg"
                    )
                )
        )
    }
}