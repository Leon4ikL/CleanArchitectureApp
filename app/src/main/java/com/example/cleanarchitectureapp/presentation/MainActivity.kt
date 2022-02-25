package com.example.cleanarchitectureapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.cleanarchitectureapp.R
import com.example.cleanarchitectureapp.data.repository.UserRepositoryImpl
import com.example.cleanarchitectureapp.domain.models.SaveUserNameParam
import com.example.cleanarchitectureapp.domain.models.UserName
import com.example.cleanarchitectureapp.domain.repository.UserRepository
import com.example.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import com.example.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {
    //Инициализация Use Case`ов
    //TODO (заменить на Dagger)
    private val userRepository by lazy { UserRepositoryImpl(context = applicationContext) }
    private val getUserNameUseCase by lazy { GetUserNameUseCase(userRepository) }
    private val saveUserNameUseCase by lazy { SaveUserNameUseCase(userRepository) }

    //Инициализация view элементов
    private val dataTextView by lazy { findViewById<TextView>(R.id.dataText) }
    private val dataEditView by lazy { findViewById<EditText>(R.id.etSetData) }
    private val saveButton by lazy { findViewById<Button>(R.id.saveData) }
    private val getButton by lazy { findViewById<Button>(R.id.getData) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Клик по кнопке Save Data
        saveButton.setOnClickListener {
            val text = dataEditView.text.toString()
            val params = SaveUserNameParam(firstName = text)
            val result = saveUserNameUseCase.invoke(param = params)
            dataTextView.text = getString(R.string.save_result_massage, result.toString())
        }
        //Клик по кнопке Get Data
        getButton.setOnClickListener {
            val userName: UserName = getUserNameUseCase.invoke()
            dataTextView.text = getString(R.string.get_result_massage, userName.firstName, userName.lastName)
        }
    }
}