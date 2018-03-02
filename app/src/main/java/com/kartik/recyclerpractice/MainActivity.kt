package com.kartik.recyclerpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter=Adapter()
    }

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private var mTV:TextView = view.findViewById(R.id.textView)
        private var mIV:ImageView = view.findViewById(R.id.imageView)
        //added ET because it will add line which can differentiate from other views
        private var mET:EditText = view.findViewById(R.id.editText)

        fun bindData(image: Int, text: String) {
            mTV.text=text
            mIV.setImageResource(image)
        }
    }

    inner class Adapter : RecyclerView.Adapter<Holder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            val layoutInflater=LayoutInflater.from(this@MainActivity)
            val view=layoutInflater.inflate(R.layout.single_custom_item_for_list,parent,false)
            return Holder(view = view)
        }

        override fun getItemCount(): Int {
            return Data.texts.size
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            val images=Data.images
            val texts=Data.texts
            val singleImage=images[position]
            val singleText=texts[position]
            holder.bindData(singleImage,singleText)
        }

    }
}
