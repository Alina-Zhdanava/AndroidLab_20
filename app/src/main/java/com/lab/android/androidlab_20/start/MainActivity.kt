package com.lab.android.androidlab_20.start

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lab.android.androidlab_20.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(Order())

        button.setOnClickListener { presenter.makeCoffee() }

    }
}
