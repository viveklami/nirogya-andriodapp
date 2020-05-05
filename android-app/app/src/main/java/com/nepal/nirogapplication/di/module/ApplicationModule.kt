package com.nepal.nirogapplication.di.module

/**
 * Created by vivek on 29,April,2020
 */

import com.nepal.nirogapplication.data.rest.ApiCallingService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

///@Singleton
/**
 * Need to uncomment once the ViewModel is ready for use
 */
//@Module(includes = [ViewModelModule::class])
@Module
class ApplicationModule {

    private val BASE_URL = "https://api.github.com/"

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit? {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitService(retrofit: Retrofit): ApiCallingService {
        return retrofit.create<ApiCallingService>(ApiCallingService::class.java)
    }
}