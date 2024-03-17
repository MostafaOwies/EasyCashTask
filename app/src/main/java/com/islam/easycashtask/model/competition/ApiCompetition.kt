package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiDetailsParams(
    @field:Json(name = "customer_id") val customerId: Int,
    @field:Json(name = "process_id") val processId: Int,
)

@JsonClass(generateAdapter = true)
data class ApiDetailsResponse(
    @field:Json(name = "message") val message: String?,
    @field:Json(name = "data") val detailsData: DetailsDataApi?,
)

@JsonClass(generateAdapter = true)
data class DetailsDataApi(
    @field:Json(name = "visit_1") val visit1: Visit?,
    @field:Json(name = "phones") val customerPhonesNum: List<String?>?,
)

@JsonClass(generateAdapter = true)
data class Visit(
    @field:Json(name = "type") val type: String?,
)