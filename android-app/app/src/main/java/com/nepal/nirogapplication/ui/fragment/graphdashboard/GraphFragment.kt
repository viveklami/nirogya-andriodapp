package com.nepal.nirogapplication.ui.fragment.graphdashboard

/**
 * Created by vivek on 29,April,2020
 */

import android.os.Bundle
import android.view.View
import android.widget.TextView
import butterknife.BindView
import com.nepal.nirogapplication.R
import com.nepal.nirogapplication.base.BaseFragment

class GraphFragment : BaseFragment() {


    @BindView(R.id.text_dashboard)
    lateinit var textDashBoardView: TextView


   // var dashboardViewModel: DashboardViewModel = TODO()
    override fun layoutRes(): Int {
        //TODO("Not yet implemented")
        return R.layout.fragment_dashboard;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textDashBoardView.setText(R.string.title_dashboard)
//         lateinit var dashboardViewModel: DashboardViewModel
//        dashboardViewModel?.text.observe(viewLifecycleOwner, Observer {
//            textView?.text
//        })
    }

}
