package com.example.cleanarchitectureregis.presentation.ui.fragments.auth

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureregis.domain.usecase.SaveUserUseCase
import com.example.cleanarchitectureregis.domain.usecase.SetAuthorizedUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val saveUserUseCase: SaveUserUseCase,
    private val setIsAuthtorizedUseCase: SetAuthorizedUseCase
) : ViewModel() {

    fun saveUser(name: String, surname: String, age: Int, username: String, password: String) {
        saveUserUseCase(username, name, surname, age, password)
    }

    fun setIsAuthorized(boolean: Boolean) {
        setIsAuthtorizedUseCase(boolean)
    }
}