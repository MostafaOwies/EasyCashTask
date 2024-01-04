package com.islam.easycashtask.model.competition

import com.example.assessmenttask.utils.Constants
import retrofit2.http.GET

interface CompetitionAPI {
    @GET(Constants.COMPETITIONS)
    suspend fun getCompetitions(): ApiCompetitionList
}