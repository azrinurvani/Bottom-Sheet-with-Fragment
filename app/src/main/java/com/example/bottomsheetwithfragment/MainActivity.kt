package com.example.bottomsheetwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheetwithfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomSheetFragment = BottomSheetFragment()

        binding.btnShowBottomSheet.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
        }
    }
}