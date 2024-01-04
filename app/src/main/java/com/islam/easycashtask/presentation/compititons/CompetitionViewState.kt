package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.Competition

data class CompetitionViewState(
    val competition: Competition? = null,
    val competitions: List<Competition> = emptyList()
) {


}