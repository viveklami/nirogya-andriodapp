package com.nepal.nirogapplication.di.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by vivek on 29,April,2020
 */
@Module
abstract class ContextModule {
    @Binds
    internal abstract fun provideContext(application: Application): Context
}