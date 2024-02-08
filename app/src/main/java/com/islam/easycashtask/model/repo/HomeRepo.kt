package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiCompetitionMapper
import com.islam.easycashtask.model.competition.ApiInstallationPaymentParams
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.CompetitionList
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val apiCompetitionMapper: ApiCompetitionMapper,
    private val competitionAPI: CompetitionAPI,
) : HomeRepoI {
    override suspend fun getCompetition(
        serial: Int,
        transCode: Int,
        transYear: Int
    ): CompetitionList {
        try {
            return apiCompetitionMapper.mapToDomain(
                competitionAPI.getCompetitions(
                    ApiInstallationPaymentParams(
                        serial = serial,
                        transCode = transCode,
                        transYear = transYear
                    )
                )
            )
        } catch (exception: HttpException) {
            throw (exception)
        }
    }

}
