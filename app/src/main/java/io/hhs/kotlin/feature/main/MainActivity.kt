package io.hhs.kotlin.feature.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import io.hhs.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolBar()
        recycler_view.setHasFixedSize(true)
        recycler_view.adapter = EntryAdapter()
    }

    private fun initToolBar() {
        val toolbar: Toolbar? = toolbar as Toolbar
        setSupportActionBar(toolbar)
    }

}
