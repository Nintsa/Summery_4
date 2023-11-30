package com.example.assignment13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment13.model.HomeClass
import com.example.assignment13.model.ItemClass
import com.example.assignment13.databinding.FragmentHomePageBinding
import com.google.gson.Gson
import java.io.IOException


class HomePageFragment : BaseFragment<FragmentHomePageBinding>() {
    private var itemsList = mutableListOf<ItemClass>()
    private var rectanglesList = mutableListOf<HomeClass>()
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentHomePageBinding {
        return FragmentHomePageBinding.inflate(inflater,container,false)
    }

    override fun setHomePageData(binding: FragmentHomePageBinding) {
        //აქ ტტუ ავტომატურად ზრდის, მაინც მჭირდება?
    }

    override fun setItemsData(binding: FragmentHomePageBinding) {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rvHome: RecyclerView = binding.rvHomePage

        val jsonData = loadJson("Items.json")
        val homeClass = Gson().fromJson(jsonString, HomeClass::class.java)
    }

    private fun loadJson(fileName: String): String? {
        return try {
            requireContext().assets.open(fileName).bufferedReader().use { it.readText() }
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