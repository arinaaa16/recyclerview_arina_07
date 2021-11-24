package com.example.recyclerview_arina_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val  INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf(
            Superhero(
                R.drawable.pain,
                nameSuperhero = "Pain",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.konan,
                nameSuperhero = "Konan",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.zetsu,
                nameSuperhero = "Zetsu",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.sasori,
                nameSuperhero = "Sasori",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.hidan,
                nameSuperhero = "Hidan",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.kakuzu,
                nameSuperhero = "Kakuzu",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.obito,
                nameSuperhero = "Obito",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.itachi,
                nameSuperhero = "Itachi",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.kisame,
                nameSuperhero = "Kisame",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.sasuke,
                nameSuperhero = "Sasuke",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            ),

            Superhero(
                R.drawable.nagato,
                nameSuperhero = "Nagato",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum "
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }

}