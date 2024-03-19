package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.JobOrder


data class CompetitionViewState(
    val onUpdateSuccessFul: Boolean = false,
    val returnMessage: String? = null,
    val nextJobOrder: JobOrder? = null,
    val notConfirmedCustomers: List<JobOrder> = emptyList(),
)