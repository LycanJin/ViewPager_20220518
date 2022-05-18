package com.asianaidt.edu.viewpager_20220518

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.edu.viewpager_20220518.adapter.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setupValues()
    }

    fun setupEvents() {

    }

    fun setupValues() {
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

        // 재사용성 억제 (메모리 죽는것 방지?)
        mainViewPager.offscreenPageLimit = 3

        // TabLayout 과 ViewPager 연결
        tab_layout.setupWithViewPager(mainViewPager)
    }
}