package com.example.my_exam.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_exam.App
import com.example.my_exam.R
import com.example.my_exam.adapter.CategoryAdapter
import com.example.my_exam.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dbCategory = App.instance?.getDatabase()?.CategoryDao()
        val recyclerView = binding.selectRecyclerview
        recyclerView.adapter = CategoryAdapter(dbCategory!!.getAllCategory(), requireActivity())
    }
}