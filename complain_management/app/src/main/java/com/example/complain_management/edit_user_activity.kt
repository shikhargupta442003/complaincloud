package com.example.complain_management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complain_management.databinding.EditUserBinding
import com.example.complain_management.databinding.HomePageBinding

class edit_user_activity : AppCompatActivity() {
    private lateinit var binding: EditUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = EditUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.editUserAddUserBox.setOnClickListener{
            val intent= Intent(this, add_user_activity::class.java)
            startActivity(intent)
        }
    }
}