package com.example.cleanarchitectureregis.domain.usecase

import com.example.cleanarchitectureregis.domain.repositories.UserRepository
import javax.inject.Inject

class SetAuthorizedUseCase
@Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(boolean: Boolean) = repository.setAuthorized(boolean)
}