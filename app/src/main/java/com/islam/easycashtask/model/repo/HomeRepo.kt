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
            return competitionAPI.postponeOrder(ApiPostponeParam(customerId = 115158, code = 821, serial = 115, year = 2024)).message.orEmpty()
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
