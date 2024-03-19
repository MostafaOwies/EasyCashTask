package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiArrivedParam(
    @field:Json(name = "customerId") val customerId: Int,
    @field:Json(name = "processId") val processId: Int,
    @field:Json(name = "lat") val lat: String,
    @field:Json(name = "lng") val long: String,
)

