package com.nepal.nirogapplication.di.component

import android.app.Application
import com.nepal.nirogapplication.base.BaseApplication
import com.nepal.nirogapplication.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

/**
 * Created by vivek on 29,April,2020
 */
@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBindingModule::class,
    FragmentBindingModule::class,
    ContextModule::class, ViewModelModule::class, ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {


    fun inject(application: BaseApplication)

    fun inject(appServ: ApplicationModule)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}