package com.example.yumemi2.di

import com.example.yumemi2.constants.Constants.BASE_URL
import com.example.yumemi2.network.RepoResultApiService
import com.example.yumemi2.repository.ClientRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GithubClient {

    @Singleton
    @Provides
    fun provideBaseUrl(): String {
        return BASE_URL
    }

    @Singleton
    @Provides
    fun provideConverterFactory(): Converter.Factory {
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
        return okHttpClient.build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        baseUrl: String,
        okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(converterFactory)
            .client(okHttpClient)

        return retrofit.build()
    }

    @Singleton
    @Provides
    fun provideClientApiService(retrofit: Retrofit): RepoResultApiService {
        return retrofit.create(RepoResultApiService::class.java)
    }

   @Singleton
    @Provides
  fun provideGithubRepository(repoResultApiService: RepoResultApiService): ClientRepository {
       return ClientRepository(repoResultApiService)
  }
    }