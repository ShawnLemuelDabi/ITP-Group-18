package com.itpgroup18.groceryhunters.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.camera.core.CameraSelector
import androidx.camera.view.PreviewView
import androidx.databinding.DataBindingUtil
import com.itpgroup18.groceryhunters.GraphicOverlay
import com.itpgroup18.groceryhunters.R
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyScreenThreeBinding
import com.itpgroup18.groceryhunters.ui.viewmodel.MyFoodBuddyScreenThreeViewModel

class MyFoodBuddyScreenThreeFragment : Fragment() {

    private lateinit var viewModel: MyFoodBuddyScreenThreeViewModel

    private var previewView: PreviewView? = null
    private var graphicOverlay: GraphicOverlay? = null
    private var lensFacing = CameraSelector.LENS_FACING_BACK
    private var cameraSelector: CameraSelector? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentMyFoodBuddyScreenThreeBinding>(inflater,
            R.layout.fragment_my_food_buddy_screen_three, container, false)

        viewModel = ViewModelProvider(this).get(MyFoodBuddyScreenThreeViewModel::class.java)

        cameraSelector = CameraSelector.Builder().requireLensFacing(lensFacing).build()
        previewView = binding.previewView
        graphicOverlay = binding.graphicOverlay

//        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().application)
//            .get(CameraXViewModel::class.java)
//            .processCameraProvider
//            .observe(
//                this,
//                Observer { provider: ProcessCameraProvider? ->
//                    cameraProvider = provider
//                    bindAllCameraUseCases()
//                }
//            )

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

}