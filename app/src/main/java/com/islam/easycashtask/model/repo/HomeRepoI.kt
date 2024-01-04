package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.CompetitionList

interface HomeRepoI {

    suspend fun getCompetition(): CompetitionList

}