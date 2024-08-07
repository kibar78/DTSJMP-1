package com.example.dts

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dts.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setOnMenuItemClickListener {menuItem->
            when(menuItem.itemId){
                R.id.new_message->{
                    val goMessage = Intent(this,MessageActivity::class.java)
                    startActivity(goMessage)
                    true
                }
                R.id.setting->{
                    val goSetting = Intent(this,SettingActivity::class.java)
                    startActivity(goSetting)
                    true
                }
                R.id.help->{
                    val goHelp = Intent(this, HelpActivity::class.java)
                    startActivity(goHelp)
                    true
                }
                else -> false
            }
        }

        binding.btnMessage.setOnClickListener {
            val goMessage = Intent(this,MessageActivity::class.java)
            startActivity(goMessage)
        }
        binding.btnSetting.setOnClickListener {
            val goSetting = Intent(this,SettingActivity::class.java)
            startActivity(goSetting)
        }
        binding.btnHelp.setOnClickListener {
            val goHelp = Intent(this, HelpActivity::class.java)
            startActivity(goHelp)
        }
    }
}