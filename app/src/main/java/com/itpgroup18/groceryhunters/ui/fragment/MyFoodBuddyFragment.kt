package com.itpgroup18.groceryhunters.ui.fragment

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyBinding
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyScreenTwoBinding
import com.itpgroup18.groceryhunters.ui.MyFoodBuddyScreenThreeActivity
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyScreenTwoViewModel
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyViewModel

class MyFoodBuddyFragment : Fragment() {


    private lateinit var viewModel: MyFoodBuddyViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentMyFoodBuddyBinding>(inflater,
            R.layout.fragment_my_food_buddy, container, false)

        viewModel = ViewModelProvider(this)[MyFoodBuddyViewModel::class.java]

        binding.btnGo.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_myFoodBuddyFragment_to_myFoodBuddyScreenTwoFragment)
        }


        return binding.root
    }

}