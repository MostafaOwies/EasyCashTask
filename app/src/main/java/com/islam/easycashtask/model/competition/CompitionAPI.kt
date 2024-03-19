package com.islam.easycashtask.model.competition

import com.example.assessmenttask.utils.ApiParameters
import com.example.assessmenttask.utils.Constants
import retrofit2.http.Headers
import retrofit2.http.POST

interface CompetitionAPI {
    @Headers("${ApiParameters.ACCEPT}: application/json")
    @POST(Constants.VISIT)
    suspend fun getVisit(): ApiDailyJobOrders
}