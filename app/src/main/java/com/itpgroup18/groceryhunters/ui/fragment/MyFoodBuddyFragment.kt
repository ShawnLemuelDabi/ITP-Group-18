package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyBinding
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyViewModel

class MyFoodBuddyFragment : Fragment() {

    companion object {
        fun newInstance() = MyFoodBuddyFragment()
    }

    private lateinit var viewModel: MyFoodBuddyViewModel

    private var _binding: FragmentMyFoodBuddyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_my_food_buddy, container, false)

        return binding.root
    }

}