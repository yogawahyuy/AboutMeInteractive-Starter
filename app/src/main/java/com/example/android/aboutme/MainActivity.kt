/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.android.example.aboutme.databinding.ActivityMainBinding
import com.example.android.aboutme.MyName

/**
 * Main Activity of the AboutMe app. This app demonstrates:
 *     * EditText
 *     * Entering, getting, and displaying text.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName:MyName= MyName("Yoga Wahyu")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName=myName
        binding.btnDone.setOnClickListener { addNickname() }

    }
    private fun addNickname(){
        binding.apply {
            binding.textName.visibility = View.VISIBLE
            binding.edtTextName.visibility = View.GONE
            binding.btnDone.visibility = View.GONE
            binding.textName.text = edtTextName.text.toString()
        }
    }
}
