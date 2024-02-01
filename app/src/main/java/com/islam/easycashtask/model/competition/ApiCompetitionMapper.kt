package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

class ApiCompetitionMapper @Inject constructor() : ApiMapper<ApiCompetitionList, CompetitionList> {
    override fun mapToDomain(apiEntity: ApiCompetitionList): CompetitionList {

        return CompetitionList(
            message = apiEntity.message.orEmpty(),
            data = mapCompetition(apiEntity.data)
        )

    }

    private fun mapCompetition(apiCompetition: ApiCompetition?): Competition {
        return Competition(
            deviceName = apiCompetition?.deviceName.orEmpty(),
            devicePrice = apiCompetition?.devicePrice.orEmpty(),
            paymentMethod = apiCompetition?.paymentMethod.orEmpty(),
            amountOfInstallment = apiCompetition?.amountOfInstallment.orEmpty(),
            numberOfInstallment = apiCompetition?.numberOfInstallment.orEmpty(),
            depositWhenInstallment = apiCompetition?.depositWhenInstallment.orEmpty(),
            depositCollecting = apiCompetition?.depositCollecting.orEmpty(),
            ernast = apiCompetition?.ernast.orEmpty(),
        )
    }
}
