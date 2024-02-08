package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.CompetitionList

interface HomeRepoI {
    suspend fun getCompetition(
        serial: Int,
        transCode: Int,
        transYear: Int
    ): CompetitionList
}