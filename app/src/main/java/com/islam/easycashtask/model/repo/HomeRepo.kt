package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiCheckWorkStatusMapper
import com.islam.easycashtask.model.competition.ApiCompetitionMapper
import com.islam.easycashtask.model.competition.ApiReturnParam
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.CompetitionList
import com.islam.easycashtask.model.competition.WorkState
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val apiCompetitionMapper: ApiCompetitionMapper,
    private val competitionAPI: CompetitionAPI,
    private val apiCheckWorkStatusMapper: ApiCheckWorkStatusMapper,
) : HomeRepoI {
    override suspend fun returnOrder(
        customerId: Int,
        code: Int,
        serial: Int,
        year: Int,
        hourCode: Int,
    ): String {
        try {
            return competitionAPI.returnOrder(
                ApiReturnParam(
                    customerId = customerId,
                    code = code,
                    serial = serial,
                    year = year,
                    hourCode = hourCode
                )
            ).message.orEmpty()
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
