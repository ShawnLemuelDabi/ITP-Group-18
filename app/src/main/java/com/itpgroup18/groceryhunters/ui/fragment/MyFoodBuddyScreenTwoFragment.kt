package com.itpgroup18.groceryhunters.ui.fragment

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.databinding.FragmentHomeBinding
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyBinding
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyScreenTwoBinding
import com.itpgroup18.groceryhunters.ui.MyFoodBuddyScreenThreeActivity
import com.itpgroup18.groceryhunters.ui.viewmodel.HomeViewModel
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyScreenTwoViewModel

class MyFoodBuddyScreenTwoFragment : Fragment() {

    private lateinit var viewModel: MyFoodBuddyScreenTwoViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentMyFoodBuddyScreenTwoBinding>(inflater,
            R.layout.fragment_my_food_buddy_screen_two, container, false)

        viewModel = ViewModelProvider(this)[MyFoodBuddyScreenTwoViewModel::class.java]

        binding.btnScanQRCode.setOnClickListener {
            val i = Intent(requireContext(), MyFoodBuddyScreenThreeActivity::class.java)
            startActivity(i)
        }

        return binding.root
    }



}