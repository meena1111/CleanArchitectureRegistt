package com.example.cleanarchitectureregis.data.local.repositories


class UserRepositoryImpl @Inject constructor(
    private val preferences: UserPreferenceHelper
) : UserRepository {

    override fun saveUser(
        username: String,
        name: String,
        surname: String,
        age: Int,
        password: String
    ) {
        preferences.username = username
        preferences.name = name
        preferences.surname = surname
        preferences.age = age
        preferences.password = password
    }

    override fun getUserName(): String = preferences.username.toString()

    override fun getName(): String = preferences.name.toString()

    override fun getSurname(): String = preferences.surname.toString()

    override fun getAge(): Int = preferences.age

    override fun getPassword(): String = preferences.password.toString()

    override fun getAuthorized(): Boolean = preferences.authorized

    override fun setAuthorized(boolean: Boolean) {
        preferences.authorized = boolean
    }
}