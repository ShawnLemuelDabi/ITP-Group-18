package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyScreenFiveViewModel

class MyFoodBuddyScreenFiveFragment : Fragment() {

    companion object {
        fun newInstance() = MyFoodBuddyScreenFiveFragment()
    }

    private lateinit var viewModel: MyFoodBuddyScreenFiveViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_food_buddy_screen_five, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyFoodBuddyScreenFiveViewModel::class.java)
        // TODO: Use the ViewModel
    }

}