package com.alireza.core.data.remote.entity

/**
 * BaseResponseModel is a base for Network response it contain 3 properties
 * @state is show network call and response is ok or fail
 * @code is show the api error code
 * @message contain error message
 * */
interface BaseResponseModel: ResponseModel {
    val state: String
    val code: Int
    val message: String
}
