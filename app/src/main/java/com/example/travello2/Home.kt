package com.example.travello2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class Home : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hm1 = requireView().findViewById<TextView>(R.id.hm1)
        val hm2 = requireView().findViewById<TextView>(R.id.hm2)
        val hm3 = requireView().findViewById<TextView>(R.id.hm3)

        hm1.setOnClickListener {
            replaceFragment(SearchBus())
        }

        hm2.setOnClickListener {
            replaceFragment(Map())
        }

        hm3.setOnClickListener {
            replaceFragment(Highway())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(
                R.id.fragmentContainer,
                fragment
            ) // Ensure fragmentContainer exists in your activity XML
            .addToBackStack(null) // Allows back navigation
            .commit()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


}