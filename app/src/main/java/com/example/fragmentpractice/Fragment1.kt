package com.example.fragmentpractice

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractice.databinding.Fragment1Binding


class Fragment1 : Fragment() {

    var mainActivity : MainActivity ?= null

    lateinit var binding : Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_1, container, false)
        binding = Fragment1Binding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener{mainActivity?.goFragment2()}
        binding.textTitle.text = arguments?.getString("key1")
        binding.textValue.text = arguments?.getInt("key2").toString()

        return binding.root //반환값이 View이기 때문에 root뷰 전달
    }

    // onAttach를 오버라이드하여 넘어오는 MainActivity의 context를 변수에 담아 onCreateView에서 사용함
    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MainActivity) mainActivity = context
    }

    fun setValue(value : String) {
        binding.textFromActivity.text = value

    }

}