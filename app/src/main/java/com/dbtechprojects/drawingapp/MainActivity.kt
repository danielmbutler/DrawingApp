package com.dbtechprojects.drawingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import java.util.jar.Attributes
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingview.setSizeForBrush(20f)
    }
}