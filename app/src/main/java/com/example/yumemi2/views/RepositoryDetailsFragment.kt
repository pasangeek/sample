package com.example.yumemi2.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.yumemi2.R
import com.example.yumemi2.databinding.FragmentRepositoryDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepositoryDetailsFragment : Fragment() {


    private lateinit var binding: FragmentRepositoryDetailsBinding
    private val repositoryDetailsViewModel: RepositoryDetailsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRepositoryDetailsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.lifecycleOwner = this
        binding.detailervm = repositoryDetailsViewModel

        return root
    }



}