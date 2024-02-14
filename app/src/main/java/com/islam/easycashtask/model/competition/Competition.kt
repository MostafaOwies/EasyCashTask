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


data class VisitReturn(
        val status :String,
        val message: String,
        val data: VisitReturnData,
)

data class VisitReturnData(
        val status: String,
)

data class EndWorkData(
        val status: WorkStatus
) {
        // todo wait to complete all status from backend
        enum class WorkStatus {
                // pending means already user started work and has sent request to end work
                 PENDING,
                // accept mean work ended and admin has accepted or not started yet
                ACCEPT,
                // NOT_STARTED,
                STARTED
        }
}


