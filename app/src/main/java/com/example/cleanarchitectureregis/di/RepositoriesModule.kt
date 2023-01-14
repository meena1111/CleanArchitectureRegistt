package com.example.cleanarchitectureregis.di

import com.example.cleanarchitectureregis.data.local.repositories.UserRepositoryImpl
import com.example.cleanarchitectureregis.domain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindUserRepository(repositoryImpl: UserRepositoryImpl): UserRepository
}