package com.example.myapplication.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityHelloBinding

class HelloActivity:Activity() {
    //xml파일 이름을 바인딩하는 변수
    private lateinit var binding: ActivityHelloBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //액티비티에 레이아웃을 연결한다.
        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.root.setOnClickListener(){
            //동작 코드
            Toast.makeText(this, "토스트 메시지", Toast.LENGTH_SHORT).show()
        }
    }
}