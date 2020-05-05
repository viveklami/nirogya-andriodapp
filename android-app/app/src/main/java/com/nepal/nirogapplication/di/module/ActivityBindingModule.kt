package com.nepal.nirogapplication.di.module

/**
 * Created by vivek on 29,April,2020
 */

import com.nepal.nirogapplication.MainActivity
import com.nepal.nirogapplication.ui.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    internal abstract fun bindSplashActivity(): SplashActivity


}