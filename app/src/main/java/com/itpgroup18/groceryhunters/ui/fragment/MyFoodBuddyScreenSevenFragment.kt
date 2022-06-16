package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyScreenSevenViewModel

class MyFoodBuddyScreenSevenFragment : Fragment() {

    companion object {
        fun newInstance() = MyFoodBuddyScreenSevenFragment()
    }

    private lateinit var viewModel: MyFoodBuddyScreenSevenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_food_buddy_screen_seven, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyFoodBuddyScreenSevenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}