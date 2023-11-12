package com.example.blooddonation.ui.auth

import io.github.dreierf.materialintroscreen.MaterialIntroActivity
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder
import android.os.Bundle
import com.example.blooddonation.R

class IntroActivity : MaterialIntroActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addSlide(SlideFragmentBuilder()
            .title("Blood Donation")
            .image(R.drawable.blood)
            .buttonsColor(R.color.colorPrimary)
            .backgroundColor(R.color.black)
            .build())

        addSlide(SlideFragmentBuilder()
            .title("Developer")
            .image(R.drawable.ic_website)
            .buttonsColor(R.color.colorPrimary)
            .backgroundColor(R.color.black)
            .build())

        addSlide(SlideFragmentBuilder()
            .title("Website")
            .image(R.drawable.ic_website)
            .buttonsColor(R.color.colorPrimary)
            .backgroundColor(R.color.black)
            .build())
    }

}