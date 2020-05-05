package com.nepal.nirogapplication.di.module




import com.nepal.nirogapplication.ui.fragment.graphdashboard.GraphFragment
import com.nepal.nirogapplication.ui.fragment.home.HomeFragment
import com.nepal.nirogapplication.ui.fragment.information.InformationFragment
import com.nepal.nirogapplication.ui.fragment.newspaper.NewsPaperFragment
import com.nepal.nirogapplication.ui.questionnaireform.QuestionnaireForm1Fragment
import com.nepal.nirogapplication.ui.questionnaireform.QuestionnaireForm2Fragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by vivek on 29,April,2020
 */
@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    internal abstract fun bindDashBoardFragment(): GraphFragment

    @ContributesAndroidInjector
    internal abstract fun questionnaireForm1Fragment(): QuestionnaireForm1Fragment

    @ContributesAndroidInjector
    internal abstract fun questionnaireForm2Fragment(): QuestionnaireForm2Fragment

    @ContributesAndroidInjector
    internal abstract fun homeFragment(): HomeFragment

    @ContributesAndroidInjector
    internal abstract fun informationFragment(): InformationFragment

    @ContributesAndroidInjector
    internal abstract fun newsPaperFragment(): NewsPaperFragment


}