package com.example.complain_management

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complain_management.databinding.ActivitySignInBinding
import com.google.android.play.integrity.internal.l
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class SignInActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setOnClickListener {
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
            firebaseAuth = FirebaseAuth.getInstance()



            binding.button.setOnClickListener {
                val email = binding.emailEt.text.toString()
                val pass = binding.passET.text.toString()

                if (email.isNotEmpty() && pass.isNotEmpty()) {

                    firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val firebaseUser = FirebaseAuth.getInstance().currentUser
                            val userId = firebaseUser?.uid
                            val adminReference =
                                FirebaseDatabase.getInstance().getReference("admins")
                                    .child(userId.toString())

                            adminReference.addListenerForSingleValueEvent(object :
                                ValueEventListener {
                                override fun onDataChange(dataSnapshot: DataSnapshot) {
                                    if (dataSnapshot.exists()) {
                                        val adminData = dataSnapshot.getValue(admindata::class.java)

                                        if (adminData != null) {
                                            when (adminData.type) {
                                                "user" -> {
                                                    val intent = Intent(
                                                        this@SignInActivity,
                                                        user_home_page_activity::class.java
                                                    )
                                                    startActivity(intent)
                                                    finish()
                                                }

                                                "admin" -> {
                                                    val intent = Intent(
                                                        this@SignInActivity,
                                                        home_page_activity::class.java
                                                    )
                                                    startActivity(intent)
                                                    finish()
                                                }

                                                else -> {
                                                    // Handle unexpected 'type' value
                                                    Toast.makeText(
                                                        this@SignInActivity,
                                                        "Unexpected user type",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                            }
                                        } else {
                                            // Handle the case where 'adminData' is null
                                            Toast.makeText(
                                                this@SignInActivity,
                                                "Admin data is null",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    } else {
                                        // Handle the case where the user node doesn't exist in the database
                                        Toast.makeText(
                                            this@SignInActivity,
                                            "User node doesn't exist",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                }

                                override fun onCancelled(databaseError: DatabaseError) {
                                    // Handle errors here
                                    Toast.makeText(
                                        this@SignInActivity,
                                        "Database Error: ${databaseError.message}",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            })
                        } else {
                            // Handle the case where signInWithEmailAndPassword is not successful
                            Toast.makeText(
                                this@SignInActivity,
                                "Sign-in failed",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                } else {
                    Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
