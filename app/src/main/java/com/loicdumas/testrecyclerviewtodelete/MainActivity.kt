package com.loicdumas.testrecyclerviewtodelete

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.DefaultItemAnimator




class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = recycler_view
        val adapter = MyAdapter(listOf(
                Person("Jake", "Painter"),
                Person("Jake", "Glace"),
                Person("Jake", "ark"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("John", "Policierr"),
                Person("John", "Dev"),
                Person("Jake", "racist"),
                Person("John", "Downloaderr"),
                Person("John", "pirate"),
                Person("John", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "racist"),
                Person("John", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("John", "Dev"),
                Person("Jake", "racist"),
                Person("John", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("John", "Policierr"),
                Person("Jake", "Dev"),
                Person("John", "racist"),
                Person("John", "racist"),
                Person("Jake", "Downloaderr"),
                Person("John", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("John", "racist"),
                Person("Jake", "Downloaderr"),
                Person("John", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("John", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("John", "Coquinne")
        ))


        recyclerView.setHasFixedSize(true)

        recyclerView.setLayoutManager(LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false))

        recyclerView.setItemAnimator(DefaultItemAnimator())
        recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        recyclerView.setAdapter(adapter)


        recyclerView.setAdapter(adapter)


    }
}


