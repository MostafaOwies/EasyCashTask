package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiPostponeParam(
        @field:Json(name = "customerId") val customerId: Int,
        @field:Json(name = "transyear") val year: Int,
        @field:Json(name = "transcode") val code: Int,
        @field:Json(name = "serial") val serial: Int,
)
