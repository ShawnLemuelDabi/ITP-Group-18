package com.itpgroup18.groceryhunters.ui.fragment

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
import com.itpgroup18.groceryhunters.ui.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var homeVM: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // 1. Tell app to use binding
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,
            R.layout.fragment_home, container, false)

        // 2. init the VM
        homeVM = ViewModelProvider(this)[HomeViewModel::class.java]

        // 3. We can now call elements by binding
        binding.tvHelloWorld.text = "Hi Guys"

        return binding.root
    }


}