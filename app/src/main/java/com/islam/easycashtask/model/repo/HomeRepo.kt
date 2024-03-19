package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiCustomerLocationsMapper
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.CustomersLocationResponse
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
    private val apiCustomerLocationsMapper: ApiCustomerLocationsMapper,


    ) : HomeRepoI {
    override suspend fun getCustomersLocation(): CustomersLocationResponse {
        try {
            return apiCustomerLocationsMapper.mapToDomain(competitionAPI.getCustomersLocations())
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}