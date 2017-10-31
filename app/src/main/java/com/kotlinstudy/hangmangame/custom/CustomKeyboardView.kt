package com.kotlinstudy.hangmangame.custom

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

/**
 * Created by angelica on 10/26/17.
 */

class CustomKeyboardView : LinearLayout {

    constructor(context: Context) : super(context) {

        val recyclerView = RecyclerView(context)
        recyclerView.layoutParams = LinearLayout.LayoutParams (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)

        addView(recyclerView)
    }

    class Adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        override fun getItemCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    class KeyViewHolder(val view: View): RecyclerView.ViewHolder(view) {


        fun bind(){

        }
    }
}
