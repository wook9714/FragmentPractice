package com.example.fragmentpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentpractice.databinding.Fragment4Binding

//SenderFragment
class Fragment4 : Fragment() {

    val TAG : String = "로그"
    lateinit var binding : Fragment4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment4 - onCreateView() called")
        binding = Fragment4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "Fragment4 - onViewCreated() called")

        binding.btnYes.setOnClickListener {
            val bundle = bundleOf("valueKey" to "Yes") //키 to 값
            setFragmentResult("request", bundle)
            Log.d(TAG, "Fragment4 - btnYes Clicked")
        }

        binding.btnNo.setOnClickListener {
            val bundle = bundleOf("valueKey" to "No")
            setFragmentResult("request", bundle)
            Log.d(TAG, "Fragment4 - btnNo Clicked")
        }

    }
}