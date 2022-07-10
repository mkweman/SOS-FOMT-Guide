package com.project.sosfomtguide

import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){

    private lateinit var backButton: ImageButton
    private lateinit var headerText: TextView
    private lateinit var searchButton: ImageButton
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backButton = findViewById(R.id.button_back)
        headerText = findViewById(R.id.text_header)
        searchButton = findViewById(R.id.button_search)

        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentView, FarmFragment.newInstance()).commit()

        searchButton.setOnClickListener {
            Log.d("Search", "Search button clicked")
            supportFragmentManager.beginTransaction().replace(R.id.mainFragmentView, SearchFragment.newInstance()).commit()
        }

        bottomNav = findViewById(R.id.bottom_nav)
        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.navigation_farm -> {
                    supportFragmentManager.beginTransaction().replace(R.id.mainFragmentView, FarmFragment.newInstance()).commit()
                    true
                }
                R.id.navigation_calendar -> {
                    //supportFragmentManager.beginTransaction().replace(R.id.mainFragmentView, CalendarFragment.newInstance()).commit()
                    true
                }
                R.id.navigation_characters -> {
                    //supportFragmentManager.beginTransaction().replace(R.id.mainFragmentView, CharactersFragment.newInstance()).commit()
                    true
                }
                R.id.navigation_town -> {
                    //supportFragmentManager.beginTransaction().replace(R.id.mainFragmentView, TownFragment.newInstance()).commit()
                    true
                }
                else -> false
            }

        }
    }

    fun setHeaderText(text: String) {
        headerText.text = text
    }
}