package com.example.summery_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summery_4.databinding.FragmentHomePageBinding
import com.google.gson.Gson
import java.io.IOException

class HomePageFragment : BaseFragment<FragmentHomePageBinding>() {
    private var itemsList = mutableListOf<ItemClass>()
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomePageBinding {
        return FragmentHomePageBinding.inflate(inflater, container, false)
    }

    override fun setItemsData(binding: FragmentHomePageBinding) {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rvHome: RecyclerView = binding.rvItem

        val jsonData = loadJson("items.json")

        val homeClass = Gson().fromJson(jsonString, ItemClass::class.java)
    }

    private fun loadJson(items: String): String? {
        return try {
            requireContext().assets.open(items).bufferedReader().use { it.readText() }
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}