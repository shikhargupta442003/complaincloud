package com.example.complain_management

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complain_management.databinding.AddUserBinding
import com.example.complain_management.databinding.HomePageBinding
import com.google.firebase.database.FirebaseDatabase

class add_user_activity : AppCompatActivity() {
    private lateinit var binding:AddUserBinding
    private lateinit var database:FirebaseDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userId = intent.getStringExtra("userId")
    database=FirebaseDatabase.getInstance()
    binding.scrollableContent.newUser.setOnClickListener {
        val name=binding.scrollableContent.enterName.text.toString()
        val age=binding.scrollableContent.enterAge.text.toString()
        val email=binding.scrollableContent.enterEMailId.text.toString()
        val number=binding.scrollableContent.enterMobileNumber.text.toString()
        val flat_no=binding.scrollableContent.enterFlatNo.text.toString()
        val building_no=binding.scrollableContent.enterBuildingNo.text.toString()
        val building_name=binding.scrollableContent.enterBuildingName.text.toString()
        if(name.isEmpty() || age.isEmpty()||email.isEmpty()||number.isEmpty()||flat_no.isEmpty()||building_no.isEmpty()||building_name.isEmpty()){
            if(name.isEmpty()){
                Toast.makeText(this,"Name Required", Toast.LENGTH_SHORT).show()
            }
            if(age.isEmpty()){
                Toast.makeText(this,"Age Required", Toast.LENGTH_SHORT).show()
            }
            if(email.isEmpty()){
                Toast.makeText(this,"Email Required", Toast.LENGTH_SHORT).show()
            }
            if(number.isEmpty()){
                Toast.makeText(this,"Number Required", Toast.LENGTH_SHORT).show()
            }
            if(flat_no.isEmpty()){
                Toast.makeText(this,"Flat No. Required", Toast.LENGTH_SHORT).show()
            }
            if(building_no.isEmpty()){
                Toast.makeText(this,"Building No. Required", Toast.LENGTH_SHORT).show()
            }
            if(building_name.isEmpty()){
                Toast.makeText(this,"Building Name Required", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }
}