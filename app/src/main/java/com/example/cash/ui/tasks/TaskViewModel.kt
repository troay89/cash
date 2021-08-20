package com.example.cash.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.cash.data.TaskDao

class TaskViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
): ViewModel() {

    val tasks = taskDao.getTasks().asLiveData()
}