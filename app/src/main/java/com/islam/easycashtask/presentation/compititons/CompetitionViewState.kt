package com.islam.easycashtask.presentation.compititons

import com.islam.easycashtask.model.competition.SendSmsResponse


data class CompetitionViewState(
    val onUpdateSuccessFul: Boolean = false,
    val smsMessage: SendSmsResponse? = null,
)