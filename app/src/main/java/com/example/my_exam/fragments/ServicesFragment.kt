package com.example.my_exam.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.my_exam.App
import com.example.my_exam.R
import com.example.my_exam.adapter.ServicesAdapter
import com.example.my_exam.databinding.FragmentServicesBinding

class ServicesFragment : Fragment() {
    private var _binding: FragmentServicesBinding? = null
    private val binding get() = _binding!!
    private val args: ServicesFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val services = App.instance?.getDatabase()?.ServicesDao()?.getAllServices()
        val filteredArray = services?.filter { it.fkCategory == args.categoryId } as ArrayList
        val recyclerView = binding.servicesRecyclerview
        recyclerView.adapter = ServicesAdapter(filteredArray, requireActivity())
    }
}