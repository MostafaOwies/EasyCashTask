package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.Competition
import com.islam.easycashtask.model.competition.CompetitionList

data class CompetitionViewState(
    val competition: CompetitionList? = null,
    val competitions: List<Competition>? = emptyList(),

    ) {


}