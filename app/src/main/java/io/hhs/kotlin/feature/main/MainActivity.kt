package io.hhs.kotlin.feature.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.hhs.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.text = getString(R.string.app_name)
    }
}
