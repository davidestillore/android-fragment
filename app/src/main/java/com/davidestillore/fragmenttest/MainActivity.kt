package com.davidestillore.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidestillore.fragmenttest.R.*
import com.davidestillore.fragmenttest.fragments.FavoritesFragment
import com.davidestillore.fragmenttest.fragments.HomeFragment
import com.davidestillore.fragmenttest.fragments.SettingsFragment
import com.davidestillore.fragmenttest.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoritesFragment(), "Favorites")
        adapter.addFragment(SettingsFragment(), "Settings")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(drawable.ic_baseline_settings_24)

    }
}