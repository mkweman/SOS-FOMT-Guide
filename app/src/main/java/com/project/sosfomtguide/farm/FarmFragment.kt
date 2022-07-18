package com.project.sosfomtguide.farm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.sosfomtguide.MainActivity
import com.project.sosfomtguide.R

class FarmFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity).setHeaderText("Farm")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_farm, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(): FarmFragment {
            return FarmFragment()
        }
    }
}