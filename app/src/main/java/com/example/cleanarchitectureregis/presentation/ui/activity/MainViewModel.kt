package com.example.cleanarchitectureregis.presentation.ui.activity

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureregis.domain.usecase.GetAuthorizedUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getIsAuthorizedUseCase: GetAuthorizedUseCase
) : ViewModel() {

    fun getIsAuthtorized() = getIsAuthorizedUseCase()

}