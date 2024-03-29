package com.alireza.core.presentation.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.distinctUntilChanged

/**
 * BaseViewModel is a base class for viewModels, it contain errorState flow to reduce Boilerplate codes
 * and handle errors in a structured base model.
 * */
open class BaseViewModel : ViewModel() {
    protected val _errorState = MutableSharedFlow<BaseViewModelState>(
        replay = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )
    val errorState: Flow<BaseViewModelState> = _errorState.distinctUntilChanged()
}