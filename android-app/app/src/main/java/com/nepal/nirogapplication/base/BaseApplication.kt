package com.nepal.nirogapplication.base

import com.nepal.nirogapplication.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by vivek on 29,April,2020
 */
class BaseApplication : DaggerApplication(){


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

        val component = DaggerApplicationComponent.builder().application(this).build()
        component.inject(this)

        return component
    }
}