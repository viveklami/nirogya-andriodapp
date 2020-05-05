package com.nepal.nirogapplication.ui

/**
 * Created by vivek on 29,April,2020
 */

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import butterknife.BindView
import com.nepal.nirogapplication.MainActivity
import com.nepal.nirogapplication.R
import com.nepal.nirogapplication.base.BaseActivity
import com.nepal.nirogapplication.ui.questionnaireform.QuestionnaireForm1Fragment
import com.nepal.nirogapplication.util.AppConstants

class SplashActivity : BaseActivity() {

    @BindView(R.id.imgLogo) lateinit var imgGirlLogo: ImageView
    @BindView(R.id.txtStart) lateinit var txtViewApp: TextView
    @BindView(R.id.txtCovid) lateinit var txtViewCovid: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToQuestionierFragment()
    }

    override fun layoutRes(): Int {
       // TODO("Not yet implemented")
        return R.layout.activity_splash
    }

    /**
     * Open main activity when enter button clicked for now. Will be changed in future
     */
    private fun openMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    // Replace current Fragment with the destination Fragment.
    private fun replaceFragment(destFragment: Fragment?) {

        hideResources();
        // First get FragmentManager object.
        val fragmentManager: FragmentManager = this.supportFragmentManager

        // Begin Fragment transaction.
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        // Replace the layout holder with the required Fragment object.
        fragmentTransaction.replace(R.id.dynamic_fragment_frame_layout, destFragment!!)

        // Commit the Fragment replace action.
        fragmentTransaction.commit()

    }

    private fun hideResources(){
        imgGirlLogo?.visibility = View.GONE
        txtViewApp?.visibility = View.GONE
        txtViewCovid?.visibility = View.GONE
    }

    private fun navigateToQuestionierFragment(){

        Handler().postDelayed(Runnable
        /*
         * Showing splash screen with a timer. This will be useful when you
         * want to show case your app logo / company
         */
        { // This method will be executed once the timer is over
            // Start your app main activity
//            val i = Intent(this, MainActivity::class.java)
//            startActivity(i)
            val userQuestionnaire = QuestionnaireForm1Fragment()
            replaceFragment(userQuestionnaire)

        }, AppConstants.SPLASH_TIME_OUT.toLong()
        )
    }
}
