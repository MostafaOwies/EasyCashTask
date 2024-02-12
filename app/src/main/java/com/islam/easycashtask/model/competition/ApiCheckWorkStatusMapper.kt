package com.islam.easycashtask.model.competition


import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

class ApiCheckWorkStatusMapper @Inject constructor() : ApiMapper<ApiWorkState, WorkState> {

    override fun mapToDomain(apiEntity: ApiWorkState): WorkState {
        return WorkState(
            message = apiEntity.message.orEmpty(),
            status = apiEntity.status.orEmpty(),
            data = WorkStateData(
                status = apiEntity.data?.status.orEmpty()
            )
        )
    }
}