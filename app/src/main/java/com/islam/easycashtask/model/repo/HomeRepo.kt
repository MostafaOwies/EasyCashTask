package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiCheckWorkStatusMapper
import com.islam.easycashtask.model.competition.ApiCompetitionMapper
import com.islam.easycashtask.model.competition.ApiPostponeParam
import com.islam.easycashtask.model.competition.CompetitionAPI
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val apiCompetitionMapper: ApiCompetitionMapper,
    private val competitionAPI: CompetitionAPI,
    private val apiCheckWorkStatusMapper: ApiCheckWorkStatusMapper,
) : HomeRepoI {
    override suspend fun postponeOrder(
        customerId: Int,
        code: Int,
        serial: Int,
        year: Int,
    ): String {
        try {
            return competitionAPI.postponeOrder(
                ApiPostponeParam(
                    customerId = customerId,
                    code = code,
                    serial = serial,
                    year = year
                )
            ).message.orEmpty()
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
