package com.islam.easycashtask.model.competition


import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

class ApiCheckWorkStatusMapper @Inject constructor() : ApiMapper<ApiWorkState, WorkState> {

    override fun mapToDomain(apiEntity: ApiWorkState): WorkState {
        val details = apiEntity.data?.details
        return WorkState(
            message = apiEntity.message.orEmpty(), data = WorkStateData(
                status = apiEntity.data?.status.orEmpty(), details = WorkStateDetails(
                    id = details?.id.orEmpty(),
                    date = details?.date.orEmpty(),
                    startTime = details?.startTime.orEmpty(),
                    requestEndTime = details?.requestEndTime.orEmpty(),
                    endTime = details?.endTime.orEmpty()
                )
            )
        )
    }
}