package com.example.pacepal.userprofile

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import com.example.pacepal.IntroActivity
import com.example.pacepal.R
import com.example.pacepal.base.BaseFragment
import com.example.pacepal.databinding.FragmentGenderBinding

class GenderFragment : BaseFragment<FragmentGenderBinding>(R.layout.fragment_gender) {
    private var introActivity: IntroActivity? = null
    private val genderFragment by lazy { GenderFragment() }
    private val birthYearFragment by lazy { BirthYearFragment() }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        introActivity = context as IntroActivity
    }

    override fun init() {
        binding.vm = genderFragment
        initViewComponent()
    }

    private fun initViewComponent() {
        val spannable = SpannableStringBuilder("당신만을 위한 \nPacer\n\n고객님께 더 적합한 운동측정과 추천을 제공하기\n위해 고객님의 간단한 정보가 필요합니다.\n\n성별부터 시작해 볼까요~?")

        val start = 0 // 변경할 텍스트의 시작 인덱스
        val end = 14 // 변경할 텍스트의 끝 인덱스
        val textSize = 20 // 변경할 글자 크기 (sp)
        val textColor = Color.BLACK
        val isBold = true // 글자 굵기 여부

        spannable.setSpan(AbsoluteSizeSpan(textSize, true), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(ForegroundColorSpan(textColor), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(StyleSpan(if (isBold) Typeface.BOLD else Typeface.NORMAL), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.introTextView.text = spannable
        binding.femaleBtn.setOnClickListener { introActivity?.changeFragment(birthYearFragment) }
        binding.maleBtn.setOnClickListener { introActivity?.changeFragment(birthYearFragment) }
    }

    companion object {

    }
}