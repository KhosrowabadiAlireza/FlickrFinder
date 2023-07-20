package com.alireza.core.data.repository

/**
 * DataModel is wrapper to hold data and exceptions and pass to domain layer (UseCases)
 * T is a Generic model to hold data model requested
 * */
sealed class DataModel<out T: Any>

    class Success<out T: Any>(val data: T) : DataModel<T>()
    class ErrorModel<out T: Any>(val data: T?, val code: Int, val message: String?) : DataModel<T>()
    class ExceptionModel<T: Any>(val e: Throwable) : DataModel<T>()