package com.example.physics


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class HomeFragment : Fragment() {

    lateinit var listView: ListView
    lateinit var dailyList: ArrayList<dailyView>
    lateinit var dailyAdapter: dailySimpleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val context: Context? = context
        listView = view.findViewById(R.id.list)
        dailyList = java.util.ArrayList<dailyView>()
        dailyAdapter = dailySimpleAdapter(context!!, dailyList)

        dailyList.add(dailyView("123"))
        dailyAdapter = dailySimpleAdapter(context!!, dailyList)
        listView.adapter = dailyAdapter
        return view
    }


}