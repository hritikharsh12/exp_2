package com.example.exp2

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var lifecycleText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleText = findViewById(R.id.lifecycleText)

        showLifecycle("onCreate()")
    }

    override fun onStart() {
        super.onStart()
        showLifecycle("onStart()")
    }

    override fun onResume() {
        super.onResume()
        showLifecycle("onResume()")
    }

    override fun onPause() {
        super.onPause()
        showLifecycle("onPause()")
    }

    override fun onStop() {
        super.onStop()
        showLifecycle("onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        showLifecycle("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        showLifecycle("onDestroy()")
    }

    private fun showLifecycle(method: String) {
        Log.d("ActivityLifecycle", method)
        if (::lifecycleText.isInitialized) {
            lifecycleText.text = getString(R.string.current_lifecycle_format, method)
        }
    }
}
