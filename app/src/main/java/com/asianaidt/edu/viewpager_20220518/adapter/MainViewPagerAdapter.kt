package com.asianaidt.edu.viewpager_20220518.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.asianaidt.edu.viewpager_20220518.fragments.HelloFragment
import com.asianaidt.edu.viewpager_20220518.fragments.NameFragment
import com.asianaidt.edu.viewpager_20220518.fragments.PhoneFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> PhoneFragment()
            else -> HelloFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {

        // 각 페이지별 제목 설정

        return when(position) {
            0 -> "이름"
            1 -> "폰"
            else -> "헬로"
        }
    }

}