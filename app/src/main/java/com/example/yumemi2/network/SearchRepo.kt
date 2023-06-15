package com.example.yumemi2.network

import android.database.Observable
import com.example.yumemi2.constants.Constants.END_POINT
import com.example.yumemi2.model.ResultsModel
import retrofit2.http.GET
import retrofit2.http.Query


interface SearchRepo {

    @GET(END_POINT)
    fun getReposList(@Query("q") query : String) : Observable<ResultsModel>

}