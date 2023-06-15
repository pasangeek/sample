package com.example.yumemi2.model

import android.os.Parcelable


data class RepoDetailsResponse(
    val name: String,
    val ownerIconUrl: String,
    val language: String,
    val stargazersCount:Int,
    val watchersCount: Int,
    val forksCount: Int,
    val openIssuesCount: Int,
)
