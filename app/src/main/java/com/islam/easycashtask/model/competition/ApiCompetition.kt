package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiHours(
    @field:Json(name = "message") val message: String?,
    @field:Json(name = "data") val hoursList: List<ApiHourItem>?,
)

@JsonClass(generateAdapter = true)
data class ApiHourItem(
    @field:Json(name = "HourCode") val hourCode: String?,
    @field:Json(name = "Hour") val hour: String?
)