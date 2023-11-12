package com.example.blooddonation.ui.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.blooddonation.R
import com.example.blooddonation.databinding.FragmentProfileBinding
import com.example.blooddonation.model.UserModel
import com.example.blooddonation.utils.Config
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding
    lateinit var db: FirebaseFirestore
    lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)

        db = FirebaseFirestore.getInstance()
        auth = FirebaseAuth.getInstance()

        val currentUserId = auth.currentUser!!.uid

        Config.showDialog(requireContext())

        db.collection("users").document(currentUserId).get()
            .addOnSuccessListener { result ->

                val data = result.toObject(UserModel::class.java)
                binding.userName.setText(data!!.name.toString())
                binding.userPhone.setText(data!!.phone.toString())
                binding.userEmail.setText(data!!.email.toString())
                binding.userBlood.setText(data!!.blood).toString()

                Config.hideDialog()

            }

        return binding.root
    }

}