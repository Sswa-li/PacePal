package com.example.pacepal.userprofile

import android.content.Context
import com.example.pacepal.IntroActivity
import com.example.pacepal.R
import com.example.pacepal.base.BaseFragment
import com.example.pacepal.databinding.FragmentBirthYearBinding

class BirthYearFragment : BaseFragment<FragmentBirthYearBinding>(R.layout.fragment_birth_year) {
    private var introActivity: IntroActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        introActivity = context as IntroActivity
    }


    override fun init() {
        binding.vm = BirthYearFragment()
        initViewComponent()
    }

    private fun initViewComponent() {
    }

    companion object {

    }
}