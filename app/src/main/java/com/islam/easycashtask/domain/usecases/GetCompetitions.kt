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
        hourCode: Int
    ): String {
        return homeRepoI.returnOrder(
            customerId = customerId,
            code = code,
            serial = serial,
            year = year,
            hourCode = hourCode
        )
    }
}