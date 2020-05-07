package com.example.spinnerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: ArrayList<ItemHolder> = ArrayList()

        list.add(ItemHolder(R.drawable.ic_android_black_24dp, "Android"))
        list.add(ItemHolder(R.drawable.ic_announcement_black_24dp, "Announcement"))
        list.add(ItemHolder(R.drawable.ic_assignment_black_24dp, "Assignment"))
        list.add(ItemHolder(R.drawable.ic_audiotrack_black_24dp, "Audio"))

        list.add(ItemHolder(R.drawable.ic_android_black_24dp, "Android"))
        list.add(ItemHolder(R.drawable.ic_announcement_black_24dp, "Announcement"))
        list.add(ItemHolder(R.drawable.ic_assignment_black_24dp, "Assignment"))
        list.add(ItemHolder(R.drawable.ic_audiotrack_black_24dp, "Audio"))

        list.add(ItemHolder(R.drawable.ic_android_black_24dp, "Android"))
        list.add(ItemHolder(R.drawable.ic_announcement_black_24dp, "Announcement"))
        list.add(ItemHolder(R.drawable.ic_assignment_black_24dp, "Assignment"))
        list.add(ItemHolder(R.drawable.ic_audiotrack_black_24dp, "Audio"))


        val adapter: SpinnerAdapter = SpinnerAdapter(this, list)

        spinner.adapter = adapter

        spinner?.let {
            it.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                    spinner.setSelection(0)
                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(applicationContext, "" + position, Toast.LENGTH_LONG).show()
                }


            }
        }

    }
}
