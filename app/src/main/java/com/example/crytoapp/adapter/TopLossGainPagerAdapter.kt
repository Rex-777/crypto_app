package com.example.crytoapp.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.crytoapp.fragment.TopLossGainFragment

class TopLossGainPagerAdapter(fragment : Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        val fragement = TopLossGainFragment()
         val bundle = Bundle()
         bundle.putInt("position", position)
         fragement.arguments = bundle
        return fragement
    }
}