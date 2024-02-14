package com.islam.easycashtask.model.competition


import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

class ApiCheckWorkStatusMapper @Inject constructor() : ApiMapper<ApiCheckVisitReturn, VisitReturn> {

    override fun mapToDomain(apiEntity: ApiCheckVisitReturn): VisitReturn {
        return VisitReturn(
            status = apiEntity.status.orEmpty(),
            message = apiEntity.message.orEmpty(),
            data = VisitReturnData(
                status = apiEntity.data?.status.orEmpty()
            )
        )
    }
}
