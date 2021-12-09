package com.example.fragmentpractice

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractice.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    lateinit var mainActivity: MainActivity


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_2, container, false)
        val binding = Fragment2Binding.inflate(inflater,container,false)
        binding.btnBack.setOnClickListener{mainActivity.goBack()}
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity // as : 타입캐스팅
    }
}