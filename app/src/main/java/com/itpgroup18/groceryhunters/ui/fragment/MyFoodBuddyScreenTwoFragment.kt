package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyScreenTwoViewModel

class MyFoodBuddyScreenTwoFragment : Fragment() {

    companion object {
        fun newInstance() = MyFoodBuddyScreenTwoFragment()
    }

    private lateinit var viewModel: MyFoodBuddyScreenTwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_food_buddy_screen_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyFoodBuddyScreenTwoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}