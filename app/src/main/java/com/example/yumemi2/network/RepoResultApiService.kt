package com.example.yumemi2.network

import com.example.yumemi2.model.Item
import com.example.yumemi2.model.RepoDetailsResponse
import com.example.yumemi2.model.SearchRepositoryResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface RepoResultApiService {

    @Headers("Accept: application/vnd.github.v3+json")
    @GET("search/repositories")
    suspend fun getRepoDetails(
        @Query("q") q: String
    ): Response<SearchRepositoryResponse>

}