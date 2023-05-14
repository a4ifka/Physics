package com.example.physics

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class dailySimpleAdapter(context: Context, arrayList: ArrayList<dailyView>) :
    ArrayAdapter<dailyView?>(context, 0, arrayList!! as List<dailyView?>) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var currentItemView = convertView

        if (currentItemView == null) {


            currentItemView = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false)

        }

        val currentNumberPosition: dailyView? = getItem(position)

        val nameText = currentItemView!!.findViewById<TextView>(R.id.nameText)
        assert(currentNumberPosition != null)
        if (currentNumberPosition != null) {
            nameText.setText(currentNumberPosition.text)

        }

        return currentItemView
    }
}