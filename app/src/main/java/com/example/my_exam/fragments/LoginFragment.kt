package com.example.my_exam.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.my_exam.MainActivity
import com.example.my_exam.R
import com.example.my_exam.databinding.FragmentLoginBinding
import com.example.my_exam.sharedP.SharedPreference

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreference = SharedPreference(requireActivity())

        binding.saveUserBtn.setOnClickListener {
            sharedPreference.login = binding.loginEt.text.toString()
            sharedPreference.password = binding.passwordEt.text.toString()

            startActivity(Intent(requireActivity(), MainActivity::class.java))
//            Toast.makeText(requireContext(),"введите текст",Toast.LENGTH_LONG).show()
        }
    }
}