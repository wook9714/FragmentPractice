package com.example.fragmentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var fragment1 : Fragment1 // setFragment1 실행 전 fragment1의 내장함수 사용가능하게

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFragment1()
        binding.btnSend.setOnClickListener {
            fragment1.setValue("전달할 값")
        }

        binding.btnToFToFActivity.setOnClickListener {
            var intent = Intent(this, FragmentToFragmentActivity ::class.java)
            startActivity(intent)
        }

    }

    fun setFragment1(){
        fragment1 = Fragment1()

        var bundle = Bundle()
        bundle.putString("key1", "Fragment1")
        bundle.putInt("key2", 20210101)
        fragment1.arguments = bundle

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, fragment1)
        transaction.commit()
    }

    fun goFragment2() {
        val fragment2 = Fragment2()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, fragment2)
        transaction.addToBackStack("fragment2") //프래그먼트 트랜잭션을 백스택에
        transaction.commit()

    }

    fun goBack() {
        onBackPressed()
    }

}