package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.ui.viewmodel.MascotRedemptionViewModel

class MascotRedemptionFragment : Fragment() {

    companion object {
        fun newInstance() = MascotRedemptionFragment()
    }

    private lateinit var viewModel: MascotRedemptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mascot_redemption, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MascotRedemptionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}