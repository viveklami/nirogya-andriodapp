package com.nepal.nirogapplication.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserData(
//        @SerializedName("data")
//        @Expose
//        var data: LoginResponse? = null,

        @SerializedName("message")
        @Expose
        var message: String? = null

): Serializable