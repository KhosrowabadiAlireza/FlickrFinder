package com.alireza.core.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * BaseActivity is base class for Activities to reduce Boilerplate codes to create binding object
 * */
abstract class BaseActivity<T: ViewBinding>:AppCompatActivity(){

    private var _binding: T? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
        setContentView(binding.root)
        doOnCreate()
    }

    /**
     * return the binding class generated in sub classes and use it in setContentView() inside onCreate() function.
     * */
    abstract fun getViewBinding(): T
    protected abstract fun doOnCreate()
}