package com.example.fragmentpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentpractice.databinding.Fragment3Binding

//ReceiverFragment
class Fragment3 : Fragment() {
    
    val TAG : String = "로그" 
    lateinit var binding : Fragment3Binding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment3 - onCreateView() called")
        binding = Fragment3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "Fragment3 - onViewCreated() called")

        setFragmentResultListener("request") { key, bundle -> 
            bundle.getString("valueKey")?.let {
                binding.textReceiver.setText(it)
            }
        }
    }
}