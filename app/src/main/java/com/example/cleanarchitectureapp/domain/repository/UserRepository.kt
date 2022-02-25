package com.example.cleanarchitectureapp.domain.repository

import com.example.cleanarchitectureapp.domain.models.SaveUserNameParam
import com.example.cleanarchitectureapp.domain.models.UserName

interface UserRepository {
    fun saveName(saveParam: SaveUserNameParam): Boolean
    fun getName(): UserName
}