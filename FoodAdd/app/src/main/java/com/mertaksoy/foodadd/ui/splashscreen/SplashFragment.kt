package com.mertaksoy.foodadd.ui.splashscreen

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mertaksoy.foodadd.R


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        object : CountDownTimer(2000, 1000) {

            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                val action = SplashFragmentDirections.actionSplashFragmentToAnaSayfaFragment()
                findNavController().navigate(action)
            }
        }.start()

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


}