package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.CompetitionList
import com.islam.easycashtask.model.competition.WorkState

interface HomeRepoI {

    suspend fun checkWorkStatus(): WorkState

}