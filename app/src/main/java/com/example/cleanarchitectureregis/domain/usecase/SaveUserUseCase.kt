package com.example.cleanarchitectureregis.domain.usecase

import com.example.cleanarchitectureregis.domain.repositories.UserRepository
import javax.inject.Inject

class SaveUserUseCase
@Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(
        username: String,
        name: String,
        lastname: String,
        age: Int,
        password: String
    ) =
        repository.saveUser(username, name, lastname, age, password)
}