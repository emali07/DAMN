package com.example.appgym

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottomNavigation)

        if (savedInstanceState == null) {
            openFragment(FragmentTextFields())
            bottomNav.selectedItemId = R.id.nav_textfields
        }

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_textfields -> {
                    openFragment(FragmentTextFields())
                    true
                }
                R.id.nav_seleccion -> {
                    openFragment(FragmentSeleccion())
                    true
                }
                R.id.nav_botones -> {
                    openFragment(FragmentBotones())
                    true
                }
                R.id.nav_listas -> {
                    openFragment(FragmentListas())
                    true
                }
                R.id.nav_info -> {
                    openFragment(FragmentInfo())
                    true
                }
                else -> false
            }
        }
    }

    fun navigateToFragment(itemId: Int) {
        bottomNav.selectedItemId = itemId
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}