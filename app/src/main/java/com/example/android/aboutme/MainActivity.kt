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

/**
 * Main Activity of the AboutMe app. This app demonstrates:
 *     * EditText
 *     * Entering, getting, and displaying text.
 */
class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var btnDone : Button
    lateinit var nameText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.edt_text_name)
        btnDone=findViewById(R.id.btn_done)
        nameText=findViewById(R.id.text_name)
        btnDone.setOnClickListener { addNickname() }
    }
    private fun addNickname(){
        nameText.visibility=View.VISIBLE
        editText.visibility=View.GONE
        btnDone.visibility=View.GONE
        nameText.text=editText.text
    }
}
