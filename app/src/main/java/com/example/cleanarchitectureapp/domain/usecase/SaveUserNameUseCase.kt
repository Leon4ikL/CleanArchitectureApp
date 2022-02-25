package com.example.cleanarchitectureapp.domain.usecase

import com.example.cleanarchitectureapp.domain.models.SaveUserNameParam
import com.example.cleanarchitectureapp.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {
    operator fun invoke(param: SaveUserNameParam): Boolean{
        return userRepository.saveName(saveParam = param)
    }
}