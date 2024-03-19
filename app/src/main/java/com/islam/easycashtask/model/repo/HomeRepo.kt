package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiJobOrderDetailsMapper
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.DailyJobOrders
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
    private val jobOrderDetailsMapper: ApiJobOrderDetailsMapper,

    ) : HomeRepoI {
    override suspend fun getDailyJobOrders(): DailyJobOrders {
        try {
            return jobOrderDetailsMapper.mapToDomain(competitionAPI.getVisit())
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
