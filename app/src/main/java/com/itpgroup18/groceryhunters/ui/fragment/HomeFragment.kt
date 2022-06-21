package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.databinding.FragmentHomeBinding
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyBinding
import com.itpgroup18.groceryhunters.ui.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var homeVM: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,
            R.layout.fragment_home, container, false)


        homeVM = ViewModelProvider(this)[HomeViewModel::class.java]


        binding.btnQRCode.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_homeFragment_to_myFoodBuddyFragment)
        }

        return binding.root
    }


}