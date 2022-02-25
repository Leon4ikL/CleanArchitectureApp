package com.example.cleanarchitectureapp.domain.usecase

import com.example.cleanarchitectureapp.domain.models.UserName
import com.example.cleanarchitectureapp.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {
    operator fun invoke(): UserName = userRepository.getName()
}