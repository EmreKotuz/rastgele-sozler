package com.example.rastgelesozler

import android.telecom.Call
import com.example.mukemmelyazilar.PostMode
import retrofit2.http.GET

interface ApiServices {

    @GET("/api")
    fun getPosts(): retrofit2.Call<MutableList<PostMode>>
}