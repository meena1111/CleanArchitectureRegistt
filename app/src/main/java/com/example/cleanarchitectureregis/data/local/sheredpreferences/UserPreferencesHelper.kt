package com.example.cleanarchitectureregis.data.local.sheredpreferences

import android.content.Context
import android.content.SharedPreferences


class UserPreferenceHelper(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("user-preference", Context.MODE_PRIVATE)

    var authorized: Boolean
        get() = sharedPreferences.getBoolean("isAuthorized", false)
        set(value) = sharedPreferences.edit().putBoolean("isAuthorized", value).apply()

    var username: String?
        get() = sharedPreferences.getString("username", "")
        set(value) = sharedPreferences.edit().putString("username", value).apply()

    var password: String?
        get() = sharedPreferences.getString("password", "")
        set(value) = sharedPreferences.edit().putString("password", value).apply()

    var age: Int
        get() = sharedPreferences.getInt("age", 0)
        set(value) = sharedPreferences.edit().putInt("age", value).apply()

    var name: String?
        get() = sharedPreferences.getString("name", "")
        set(value) = sharedPreferences.edit().putString("name", value).apply()

    var lastname: String?
        get() = sharedPreferences.getString("lastname", "")
        set(value) = sharedPreferences.edit().putString("lastname", value).apply()
}