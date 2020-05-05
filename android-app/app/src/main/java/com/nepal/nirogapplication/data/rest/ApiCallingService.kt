package com.nepal.nirogapplication.data.rest


import com.nepal.nirogapplication.data.model.UserData
import io.reactivex.Single
import retrofit2.http.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody





interface ApiCallingService {
    @FormUrlEncoded
    @POST("api/login")
    fun getLoginData(@Field("email") email: String, @Field("password") password: String): Single<UserData>


    @FormUrlEncoded
    @POST("api/userData")
    fun sendUserQuestionFormData(@Field("email") email: String, @Field("password") password: String): Single<UserData>

}