package com.example.cleanarchitectureregis.presentation.ui.fragments.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cleanarchitectureregis.R
import com.example.cleanarchitectureregis.databinding.FragmentAuthBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment : Fragment(R.layout.fragment_auth) {

    private val binding by viewBinding(FragmentAuthBinding::bind)
    private val viewModel: AuthViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        registerConfirmBtn.setOnClickListener {
            if (passwordEt.text.toString() != passwordConfirmEt.text.toString()) {
                passwordEt.error = getString(R.string.password_not_match_error)
            } else {
                viewModel.saveUser(
                    nameEt.text.toString(),
                    lastName.text.toString(),
                    ageEt.text.toString().toInt(),
                    usernameEt.text.toString(),
                    passwordEt.text.toString()
                )
                viewModel.setIsAuthorized(true)
                findNavController().navigate(
                    AuthFragmentDirections.actionAuthFragmentToHomeFragment()
                )
            }
        }
    }
}