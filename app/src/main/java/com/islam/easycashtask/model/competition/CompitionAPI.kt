package com.islam.easycashtask.model.competition

import com.example.assessmenttask.utils.ApiParameters
import com.example.assessmenttask.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface CompetitionAPI {
    @GET(Constants.COMPETITIONS)
    suspend fun getCompetitions(): ApiCompetitionList
}