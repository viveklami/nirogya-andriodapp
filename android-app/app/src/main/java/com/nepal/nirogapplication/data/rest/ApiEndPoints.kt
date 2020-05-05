package com.nepal.nirogapplication.data.rest

object ApiEndPoint {

    //val BASE_URL                                = "https://uatmonitoring.javra.com" 10.0.2.13
    //LAN 10.0.1.137:8080/api/test
    //val BASE_URL                                = "http://10.0.1.137:8080"
    val BASE_URL                                = "http://10.0.2.13:8080"
    //This is live BASE_URL

    val ENDPOINT_SERVER_LOGIN                   = BASE_URL + "/api/login"
    val ENDPOINT_SERVER_DASHBOARD               = BASE_URL + "/api/dashboard"
    val ENDPOINT_SERVER_CUSTOMER                = BASE_URL + "/api/customers"
    val ENDPOINT_SERVER_USERS                   = BASE_URL + "/api/users"

}