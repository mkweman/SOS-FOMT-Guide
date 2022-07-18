package com.project.sosfomtguide.characters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.sosfomtguide.MainActivity
import com.project.sosfomtguide.R

class CharactersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity).setHeaderText("Characters")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_characters, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(): CharactersFragment {
            return CharactersFragment()
        }
    }
}