package com.example.cleanarchitectureregis.presentation.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cleanarchitectureregis.R
import com.example.cleanarchitectureregis.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    val binding by viewBinding(FragmentHomeBinding::bind)
    val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.info.visibility = View.INVISIBLE
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        infoGetBtn.setOnClickListener {
            nameInfoTv.text = viewModel.getName()
            lastnameInfoTv.text = viewModel.getSurname()
            ageInfoTv.text = viewModel.getAge().toString()
            nicknameInfoTv.text = viewModel.getUsername()
            passwordInfoTv.text = viewModel.getPassword()
            info.visibility = View.VISIBLE
        }
    }
}