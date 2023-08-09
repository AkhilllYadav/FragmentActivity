package com.example.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragmentactivity.databinding.ActivityMainBinding
import com.example.fragmentactivity.fragment.AboutFragment
import com.example.fragmentactivity.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.frame1.setOnClickListener{
            goToFragment(HomeFragment())
        }

        binding.frame2.setOnClickListener{
            goToFragment(AboutFragment())
        }


    }
    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainerView2, fragment).commit()
    }
}