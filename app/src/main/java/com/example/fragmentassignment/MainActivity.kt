package com.example.fragmentassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    lateinit var btn_profile: Button
    lateinit var  cardview:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initView()
        btn_profile.setOnClickListener {
            if(cardview.visibility == View.INVISIBLE) {
                cardview.visibility = View.VISIBLE
                supportFragmentManager.beginTransaction()
                    .add(R.id.profile_container, ProfileFragment()).commit()
            }else{
                cardview.visibility = View.INVISIBLE
                supportFragmentManager.beginTransaction()
                    .remove( ProfileFragment()).commitNow()
            }
        }


    }

    private fun initView(){
        btn_profile =findViewById(R.id.btn_profile)
        cardview =findViewById(R.id.profile_container)
    }
}