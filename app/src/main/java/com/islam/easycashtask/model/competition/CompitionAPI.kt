package com.islam.easycashtask.model.competition

import com.example.assessmenttask.utils.ApiParameters
import com.example.assessmenttask.utils.Constants
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface CompetitionAPI {
    @Headers("${ApiParameters.ACCEPT}: application/json")
    @POST(Constants.DETAILS)
    suspend fun getJobDetails(@Body params: ApiDetailsParams): ApiDetailsResponse
}