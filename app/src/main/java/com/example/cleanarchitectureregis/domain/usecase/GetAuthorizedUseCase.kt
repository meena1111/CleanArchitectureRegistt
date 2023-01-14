package com.example.cleanarchitectureregis.domain.usecase

import com.example.cleanarchitectureregis.domain.repositories.UserRepository
import javax.inject.Inject

class GetAuthorizedUseCase
@Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke() = repository.getAuthorized()
}