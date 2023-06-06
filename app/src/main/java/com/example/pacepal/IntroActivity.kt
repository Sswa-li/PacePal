package com.example.pacepal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.pacepal.userprofile.GenderFragment

class IntroActivity : AppCompatActivity() {
    private val genderFragment by lazy { GenderFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        changeFragment(genderFragment)
    }

    fun changeFragment(fragment: Fragment): Boolean {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_fcv_container, fragment)
            .commit()

        return true
    }
}