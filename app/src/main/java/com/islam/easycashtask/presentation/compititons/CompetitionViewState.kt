package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.Competition
import com.islam.easycashtask.model.competition.EndWorkData
import com.islam.easycashtask.model.competition.WorkState
import com.islam.easycashtask.model.competition.WorkStateData

data class CompetitionViewState(
    val workStatus : WorkState? = null,
    )