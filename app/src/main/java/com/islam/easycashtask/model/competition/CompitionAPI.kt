package com.islam.easycashtask.model.competition

import com.example.assessmenttask.utils.ApiParameters
import com.example.assessmenttask.utils.Constants
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface CompetitionAPI {
    @Headers("${ApiParameters.ACCEPT}: application/json")
    @POST(Constants.INSTALLATION)
    suspend fun getCompetitions(@Body apiInstallationPaymentParams: ApiInstallationPaymentParams): ApiCompetitionList

    @Headers("${ApiParameters.ACCEPT}: application/json")
    @POST(Constants.CHECK_VISIT_RETURN_ORDER)
    suspend fun checkWorkState(@Body apiCheckVisitReturnParam :ApiCheckVisitReturnParam): ApiCheckVisitReturn


}