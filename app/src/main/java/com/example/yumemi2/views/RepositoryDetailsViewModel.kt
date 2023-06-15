package com.example.yumemi2.views

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yumemi2.model.RepoDetailsResponse
import com.example.yumemi2.repository.ClientRepository
//import com.example.yumemi2.repository.ClientRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RepositoryDetailsViewModel @Inject constructor (
    private val clientRepository: ClientRepository
    ) :ViewModel() {
    private val _repoData = MutableLiveData<RepoDetailsResponse>(null)
    val repoData : LiveData<RepoDetailsResponse>
        get() = _repoData

    fun getRepoInfo(){

        viewModelScope.launch {
            val repoInfo = clientRepository.getClientDataFromDataSource("q")
            _repoData.value = repoInfo

        }
}


    }
