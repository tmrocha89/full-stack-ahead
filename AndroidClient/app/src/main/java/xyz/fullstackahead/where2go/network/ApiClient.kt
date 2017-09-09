package xyz.fullstackahead.where2go.network

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import xyz.fullstackahead.where2go.pojo.RateRequest
import xyz.fullstackahead.where2go.pojo.User

interface ApiClient {

    @POST("/login")
    fun login(@Body user: User): Call<Void>

    @POST("/api/v1/ratings")
    fun rate(@Body request: RateRequest): Call<Void>

    //@GET("/api/v1/categories")
    //fun getCategories()

}
