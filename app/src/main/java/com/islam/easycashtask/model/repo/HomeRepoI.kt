package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.CompetitionList
import com.islam.easycashtask.model.competition.VisitReturn

interface HomeRepoI {

    suspend fun getCompetition(
        serial: Int,
        transCode: Int,
        transYear: Int
    ): CompetitionList

    suspend fun checkVisitReturn(): VisitReturn

}