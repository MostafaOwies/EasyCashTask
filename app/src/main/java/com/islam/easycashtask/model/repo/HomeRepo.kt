package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiPostponeParam
import com.islam.easycashtask.model.competition.CompetitionAPI
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
) : HomeRepoI {
    override suspend fun postponeOrder(): String {
        try {
            return competitionAPI.postponeOrder(
                ApiPostponeParam(
                    customerId = 115158,
                    transcode = 821,
                    transyear = 2024,
                    serial = 115,
                    hourCode = 0
                )
            ).message.orEmpty()
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
