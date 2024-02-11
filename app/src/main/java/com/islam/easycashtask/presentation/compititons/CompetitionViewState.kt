package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.Competition
import com.islam.easycashtask.model.competition.EndWorkData
import com.islam.easycashtask.model.competition.WorkState
import com.islam.easycashtask.model.competition.WorkStateData
import com.islam.easycashtask.model.competition.WorkStateDetails

data class CompetitionViewState(
    val competition: Competition? = null,
    val competitions: List<Competition>? = emptyList(),
    val workStatus : WorkStateData? = null,
    val workStartedAt: WorkStateDetails? = null,
    val workEndedAt: String = "",
    val returnMessage :String? = null

    ) {


}