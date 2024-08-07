package com.example.dts

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDaftar.setOnClickListener {
            val goHome = Intent(this, HomeActivity::class.java)
            startActivity(goHome)

        }

        val jenisKelamin = arrayOf("Laki-Laki","Perempuan")
        val adapter = ArrayAdapter(this,R.layout.drop_down,jenisKelamin)
        (binding.textInputLayout4.editText as? AutoCompleteTextView)?.setAdapter(adapter)

    }
    
}