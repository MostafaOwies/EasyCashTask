package com.islam.easycashtask.domain.usecases

import com.islam.easycashtask.model.repo.HomeRepoI
import javax.inject.Inject

class GetCompetitions @Inject constructor(
    private val homeRepoI: HomeRepoI
) {
    suspend operator fun invoke(
        customerId: Int,
        code: Int,
        serial: Int,
        year: Int,
        hCode: Int
    ): String {
        return homeRepoI.postponeOrder(
            customerId = customerId,
            code = code,
            serial = serial,
            year = year,
            hCode=hCode
        )
    }
}