package com.example.assignment12

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment12.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {

    private var binding: FragmentHomePageBinding? = null
    private var itemsList = mutableListOf<ItemsClass>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

}