package com.nepal.nirogapplication.data.rest


import com.nepal.nirogapplication.data.model.UserData
import io.reactivex.Single
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.MultipartBody



class UserLoginService(loginService: ApiCallingService) {
    private  var loginService: ApiCallingService
    private lateinit var questionarieService: ApiCallingService

    init {
        this.loginService = loginService
        this.questionarieService = questionarieService
    }

    /**
     * Rest Api Calling Method for the Login Service
     *
     * Here Single is used as RxJava Observable variant where Single will
     * act as Observabale pattern inorder to emits the one value at a time or error
     * Note: Single replaces the Observable(onNext, onError, and onCompleted) to two methods
     * (onSuccess,OnError)
     */
    fun sendUserDataRequest(email:String, password:String) : Single<UserData> {
        return loginService.getLoginData(email, password)
    }

    /**
     * This need to change according the request params once the SERVER END ARE DONE
     */
     fun sendUserFormQuestionaireData(email:String, password:String) : Single<UserData>{
         return questionarieService.sendUserQuestionFormData(email,password)
     }


}