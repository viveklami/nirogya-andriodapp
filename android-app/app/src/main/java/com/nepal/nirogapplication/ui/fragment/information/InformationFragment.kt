package com.nepal.nirogapplication.ui.fragment.information

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nepal.nirogapplication.R
import com.nepal.nirogapplication.base.BaseFragment

class InformationFragment : BaseFragment() {

    companion object {
        fun newInstance() =
            InformationFragment()
    }

    private lateinit var viewModel: InformationViewModel
    override fun layoutRes(): Int {
        return  R.layout.information_fragment
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       // viewModel = ViewModelProviders.of(this).get(InformationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
