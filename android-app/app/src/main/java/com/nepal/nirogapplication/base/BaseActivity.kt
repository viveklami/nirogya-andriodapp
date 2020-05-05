package com.nepal.nirogapplication.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import butterknife.ButterKnife
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by vivek on 29,April,2020
 */
abstract class BaseActivity : DaggerAppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
        ButterKnife.bind(this)
    }

    @LayoutRes
    abstract fun layoutRes(): Int

}