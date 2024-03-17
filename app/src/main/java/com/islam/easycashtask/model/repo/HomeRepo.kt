package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiDetailsParams
import com.islam.easycashtask.model.competition.ApiJobOrderDetailsMapper
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.DetailsResponse
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
    private val jobOrderDetailsMapper: ApiJobOrderDetailsMapper,

    ) : HomeRepoI {
    override suspend fun reCorrectLocationApi(): DetailsResponse {
        try {
            return jobOrderDetailsMapper.mapToDomain(
                competitionAPI.getJobDetails(
                    ApiDetailsParams(9394, 1)
                )
            )
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
