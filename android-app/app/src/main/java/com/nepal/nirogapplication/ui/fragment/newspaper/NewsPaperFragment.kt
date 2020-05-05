package com.nepal.nirogapplication.ui.fragment.newspaper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.nepal.nirogapplication.R
import com.nepal.nirogapplication.base.BaseActivity
import com.nepal.nirogapplication.base.BaseFragment

/**
 * Created by vivek on 29,April,2020
 */
class NewsPaperFragment : BaseFragment() {

    private lateinit var notificationsViewModel: NewsPaperViewModel
    override fun layoutRes(): Int {
        return R.layout.fragment_notifications
    }

//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NewsPaperViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
//        val textView: TextView = root.findViewById(R.id.text_notifications)
//        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
}
