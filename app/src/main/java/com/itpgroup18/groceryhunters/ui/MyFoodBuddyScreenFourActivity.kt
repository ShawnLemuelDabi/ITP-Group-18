package com.itpgroup18.groceryhunters.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts.GetContent
import androidx.appcompat.app.AppCompatActivity
import com.itpgroup18.groceryhunters.*
import com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenFourBinding


class MyFoodBuddyScreenFourActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMyFoodBuddyScreenFourBinding
    private var uriString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyFoodBuddyScreenFourBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button1.setOnClickListener(View.OnClickListener { mGetContent.launch("image/*") })

        binding.button2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MyFoodBuddyScreenFiveActivity::class.java)
            intent.putExtra("uri", uriString)
            startActivity(intent)
        })



    }

    var mGetContent = registerForActivityResult(
        GetContent()
    ) { uri ->
        binding.imageView.setImageURI(uri)
        uriString = uri.toString()
    }

}