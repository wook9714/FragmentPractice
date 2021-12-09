package com.example.fragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentpractice.databinding.ActivityFragmentToFragmentBinding

class FragmentToFragmentActivity : AppCompatActivity() {

    val TAG : String = "로그"

    val binding by lazy { ActivityFragmentToFragmentBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d(TAG, "FragmentToFragmentActivity - onCreate() called")

    }

}