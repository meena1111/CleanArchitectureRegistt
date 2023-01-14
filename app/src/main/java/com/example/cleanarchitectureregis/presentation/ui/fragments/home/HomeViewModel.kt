package com.example.cleanarchitectureregis.presentation.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureregis.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getNameUseCase: GetNameUseCase,
    private val getSurnameUseCase: GetLastnameUseCase,
    private val getAgeUseCase: GetAgeUseCase,
    private val getUsernameUseCase: GetUsernameUseCase,
    private val getPasswordUseCase: GetPasswordUseCase
) : ViewModel() {

    fun getName() = getNameUseCase()

    fun getSurname() = getSurnameUseCase()

    fun getAge() = getAgeUseCase()

    fun getUsername() = getUsernameUseCase()

    fun getPassword() = getPasswordUseCase()
}