package com.islam.easycashtask.model.competition

data class CompetitionList(

        val message: String?,
        val data: Competition?,
)

data class Competition(
        val deviceName: String?,
        val devicePrice: String?,
        val paymentMethod: String?,
        val amountOfInstallment: String?,
        val numberOfInstallment: String?,
        val depositWhenInstallment: String?,
        val depositCollecting: String?,
        val ernast: String?,
)


data class WorkState(
        val message: String,
        val status: String,
        val data: WorkStateData,
)

data class WorkStateData(
        val status: String,
)




