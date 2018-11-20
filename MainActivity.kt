package com.example.myproject01.yousuke.recyclerviewsample1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with animals
    val animals: ArrayList<String> = ArrayList()
    val japaneseAnimals: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Loads animals into the ArrayList
        addAnimals()
        addJapaneseAnimals()

        // Creates a vertical Layout Manager
        rv_animal_list.layoutManager = LinearLayoutManager(this)
        rv_animal_japanese.layoutManager = LinearLayoutManager(this)

        // Access the RecyclerView Adapter and load the data into it
//        rv_animal_list.adapter = AnimalAdapter(animals, this)
        rv_animal_japanese.adapter = AnimalAdapter( animals , japaneseAnimals, this)

    }


    // Adds animals to the empty animals ArrayList
    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }

    fun addJapaneseAnimals() {
        japaneseAnimals.add("イヌ")
        japaneseAnimals.add("ネコ")
        japaneseAnimals.add("フクロウ")
        japaneseAnimals.add("チーター")
        japaneseAnimals.add("ラクーン")
        japaneseAnimals.add("トリ")
        japaneseAnimals.add("ヘビ")
        japaneseAnimals.add("トカゲ")
        japaneseAnimals.add("ハムスター")
        japaneseAnimals.add("クマ")
        japaneseAnimals.add("ライオン")
        japaneseAnimals.add("トラ")
        japaneseAnimals.add("ウマ")
        japaneseAnimals.add("カエル")
        japaneseAnimals.add("サカナ")
        japaneseAnimals.add("カメ")
        japaneseAnimals.add("ゾウ")
        japaneseAnimals.add("ウシ")
        japaneseAnimals.add("ビーバー")
        japaneseAnimals.add("ハリネズミ")
        japaneseAnimals.add("ラット")
        japaneseAnimals.add("マウス")
        japaneseAnimals.add("ガチョウ")
        japaneseAnimals.add("シカ")
        japaneseAnimals.add("キツネ")
        japaneseAnimals.add("ムース")
        japaneseAnimals.add("バッファロー")
        japaneseAnimals.add("サル")
        japaneseAnimals.add("ペンギン")
        japaneseAnimals.add("オウム")
    }

}
