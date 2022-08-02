package com.shoppi.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation_main)
        bottomNavigationView.itemIconTintList = null

        //NavHostFragment의 NavController에 대한 참조
        //NavController : NavHostFragment에서 destination의 이동을 관리하는 객체
        //화면 이동을 관리하는 NavController객체를 bottomNavigationView에 할당하여
        //bottomNavigationView의 아이템을 클릭했을 때 화면 이동이 이루어지도록 처리 가능.
        val navController = supportFragmentManager.findFragmentById(R.id.container_main)?.findNavController()

        //setupWithNavController()를 통해 bottomNavigationView와 FragmentContainerView의 NavHostFragment를 연결할 수 있게 됨
        navController?.let{
            bottomNavigationView.setupWithNavController(it)
        }



        Log.d(TAG, "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }


}