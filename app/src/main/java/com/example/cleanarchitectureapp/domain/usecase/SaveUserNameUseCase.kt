package com.example.cleanarchitectureapp.domain.usecase

import com.example.cleanarchitectureapp.domain.models.SaveUserNameParam

class SaveUserNameUseCase {
    operator fun invoke(param: SaveUserNameParam): Boolean{
        return param.firstName.isNotEmpty()
    }
}