package com.example.contactsmanagerapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.contactsmanagerapp.room.UserRepository

class UserViewModelFactory(private val userRepository: UserRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(UserViewModel::class.java)){
            return UserViewModel(userRepository) as T
        }
        throw java.lang.IllegalArgumentException("Unknow ViewModel Class")
    }
}