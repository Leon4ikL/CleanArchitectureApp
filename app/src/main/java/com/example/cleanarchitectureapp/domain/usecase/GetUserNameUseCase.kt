package com.example.cleanarchitectureapp.domain.usecase

import com.example.cleanarchitectureapp.domain.models.UserName

class GetUserNameUseCase {
    operator fun invoke(): UserName = UserName(firstName = "Leon", lastName = "Uraltsev")
}