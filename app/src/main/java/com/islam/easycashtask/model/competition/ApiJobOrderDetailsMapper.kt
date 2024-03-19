package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

/*
class ApiJobOrderDetailsMapper @Inject constructor() :
    ApiMapper<ApiDetailsResponse, DetailsResponse> {

    override fun mapToDomain(apiEntity: ApiDetailsResponse): DetailsResponse {
        val (message, data) = apiEntity
        val visit1 = data?.visit1

        return DetailsResponse(
            message = message.orEmpty(),
            visit1 = mapToDetails(visit1)
        )
    }

    private fun mapToDetails(apiEntity: Visit?): VisitD {
        return VisitD(
            type = apiEntity?.type.orEmpty(),
        )
    }

}*/
