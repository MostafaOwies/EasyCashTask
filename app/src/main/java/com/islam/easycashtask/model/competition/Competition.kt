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
        val data: WorkStateData,
)

data class WorkStateData(
        val status: String,
        val details: WorkStateDetails,
)

data class WorkStateDetails(
        val id: String,
        val date: String,
        val startTime: String,
        val requestEndTime: String,
        val endTime: String
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


