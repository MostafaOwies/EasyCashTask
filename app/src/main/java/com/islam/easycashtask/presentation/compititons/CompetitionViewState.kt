package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.CustomerLocationData


data class CompetitionViewState(
    val onUpdateSuccessFul: Boolean = false,
    val returnMessage: String? = null,

    val customersList: List<CustomerLocationData> = emptyList(),
)