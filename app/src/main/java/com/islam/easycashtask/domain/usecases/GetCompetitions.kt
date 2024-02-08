package com.islam.easycashtask.domain.usecases

import com.islam.easycashtask.model.competition.CompetitionList
import com.islam.easycashtask.model.repo.HomeRepoI
import javax.inject.Inject

class GetCompetitions @Inject constructor(
    private val homeRepoI: HomeRepoI
) {
    suspend operator fun invoke(
        serial: Int,
        transCode: Int,
        transYear: Int
    ): CompetitionList {
        return homeRepoI.getCompetition(
            serial = serial,
            transCode = transCode,
            transYear = transYear
        )
    }
}

