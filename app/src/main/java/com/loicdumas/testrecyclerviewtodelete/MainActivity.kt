package com.loicdumas.testrecyclerviewtodelete

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


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
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Dev"),
                Person("Jake", "racist"),
                Person("Jake", "Downloaderr"),
                Person("Jake", "pirate"),
                Person("Jake", "Policierr"),
                Person("Jake", "Coquinne")
        ))


        recyclerView.setHasFixedSize(true)

        recyclerView.setLayoutManager(LinearLayoutManager(applicationContext))
        recyclerView.setAdapter(adapter)


    }
}


