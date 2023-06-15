package com.example.yumemi2.repository

import com.example.yumemi2.model.Item
import com.example.yumemi2.network.RepoResultApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class ClientRepository @Inject constructor(
    private val repoResultApiService: RepoResultApiService,
) {


    suspend fun getClientDataFromDataSource(query: String) : Item? {

        return withContext(Dispatchers.IO){
            return@withContext getClientDataFromRemoteService(query)
        }

    }

    // From remote data source
    private suspend fun getClientDataFromRemoteService(query: String): Item? {
        var clientData: Item? = null
        val response = repoResultApiService.getRepoDetails(query)
        if (response.isSuccessful) {
            clientData = response.body()
        }

        return clientData
    }





}
