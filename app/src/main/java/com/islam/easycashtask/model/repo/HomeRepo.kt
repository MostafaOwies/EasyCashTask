package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiSmsParams
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.SendSmsResponse
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,


    ) : HomeRepoI {
    override suspend fun sendSmsToClient(): SendSmsResponse {
        try {
            val (message, code) = competitionAPI.senSmsToClient(
                ApiSmsParams(
                    113501,
                    28655,
                    821,
                    2024,
                    115,
                    "phone"
                )
            )
            return SendSmsResponse(
                message = message.orEmpty(),
                code = code.orEmpty()
            )
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}