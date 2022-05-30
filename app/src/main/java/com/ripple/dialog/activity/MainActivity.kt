package com.ripple.dialog.activity

import android.os.Bundle
import com.ripple.dialog.BaseActivity
import com.ripple.dialog.databinding.ActivityMainBinding
import com.ripple.dialog.custom.LoadingSimpleDialog

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        initView()
        initData()
    }

    private fun initView() {
        binding.btn1.setOnClickListener {
            LoadingSimpleDialog(this).show()
        }
    }

    private fun initData() {

    }
}