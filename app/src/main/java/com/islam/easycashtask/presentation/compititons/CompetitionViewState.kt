package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.Hours


data class CompetitionViewState(
    val onUpdateSuccessFul: Boolean = false,
    val hoursList: Hours = Hours("", emptyList()),
)