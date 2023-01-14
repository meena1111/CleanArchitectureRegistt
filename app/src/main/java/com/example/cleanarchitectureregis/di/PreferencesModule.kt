package com.example.cleanarchitectureregis.di

import android.content.Context
import com.example.cleanarchitectureregis.data.local.sheredpreferences.UserPreferenceHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferencesModule {

    @Provides
    @Singleton
    fun provideUserPreferenceHelper(@ApplicationContext context: Context): UserPreferenceHelper =
        UserPreferenceHelper(context)
}