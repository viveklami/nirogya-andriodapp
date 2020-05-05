package com.nepal.nirogapplication.ui.questionnaireform

/**
 * Created by vivek on 03,May,2020
 */

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import butterknife.OnClick
import com.nepal.nirogapplication.MainActivity

import com.nepal.nirogapplication.R
import com.nepal.nirogapplication.base.BaseFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionnaireForm2Fragment : BaseFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun layoutRes(): Int {
       // TODO("Not yet implemented")
        return R.layout.fragment_questionnaire2
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                QuestionnaireForm2Fragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    @OnClick(R.id.btnSubmit)
    fun onClickSubmit() {
        Log.e("Onclick","villl")
        navigateToMainDashBoard()
        Toast.makeText(
            getBaseActivity(),
            "Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT
        ).show()
    }

    @OnClick(R.id.linLayoutPrevious)
    fun onClickPrevious() {
        Log.e("Onclick","villl")
        val userQuestionnaire = QuestionnaireForm1Fragment()
        replaceFragment(userQuestionnaire)
        Toast.makeText(
            getBaseActivity(),
            "Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT
        ).show()
    }

    private fun navigateToMainDashBoard(){
        val i = Intent(getBaseActivity(), MainActivity::class.java)
            startActivity(i)

    }
    // Replace current Fragment with the destination Fragment.
    fun replaceFragment(destFragment: Fragment?) {
        // First get FragmentManager object.
        // val fragmentManager: FragmentManager = this.supportFragmentManager

        // Begin Fragment transaction.
        val fragmentTransaction: FragmentTransaction = requireFragmentManager().beginTransaction()

        // Replace the layout holder with the required Fragment object.
        fragmentTransaction.replace(R.id.dynamic_fragment_frame_layout, destFragment!!)

        // Commit the Fragment replace action.
        fragmentTransaction.commit()
        //imgGirlLogo?.visibility = View.GONE
    }
}
