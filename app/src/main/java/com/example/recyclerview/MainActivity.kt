package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_row_name_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.layoutManager= LinearLayoutManager(baseContext)
        data class person(var name:String,var age:Int,var DOB:String,var hobby:String
        )
        val names=NamesRecyclerViewAdapter(listOf(
            name("Joy",13,"29/04/2003","swimming"),
            name("Jane",15,"29/05/2001","playing football"),
            name("Ann",30,"29/05/1990","reading novels"),
            name("Joyce",21,"28/06/1999","travelling"),
            name("Julie",25,"14/09/1995","playing netball"),
            name("Mary",22,"12/10/1998","cooking"),
            name("Janet",20,"23/03/2000","running"),
            name("Anita",15,"17/02/2005","singing"),
            name("Sharon",28,"12/12/1992","playing handball"),
            name("Kate",20,"2/06/2000","swimming"))

    }

    private fun name(s: String, i: Int, s1: String, s2: String): String {

    }
}


