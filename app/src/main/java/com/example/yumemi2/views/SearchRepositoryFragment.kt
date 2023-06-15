package com.example.yumemi2.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.yumemi2.databinding.FragmentSearchRepositoryBinding
import com.example.yumemi2.views.SearchRepositoryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchRepositoryFragment : Fragment() {


    private lateinit var binding:FragmentSearchRepositoryBinding
    private val searchRepositoryViewModel: SearchRepositoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSearchRepositoryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.lifecycleOwner = this
        binding.vm = searchRepositoryViewModel


        return root
    }



}