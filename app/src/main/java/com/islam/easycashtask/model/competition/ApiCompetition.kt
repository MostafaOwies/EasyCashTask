package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiSmsParams(
    @field:Json(name = "customerId") val customerId: Int,
    @field:Json(name = "proccessId") val proccessId: Int,
    @field:Json(name = "transcode") val transcode: Int,
    @field:Json(name = "transyear") val transyear: Int,
    @field:Json(name = "serial") val serial: Int,
    @field:Json(name = "phone") val phone: String,
)

@JsonClass(generateAdapter = true)
data class ApiSendSmsResponse(
    @field:Json(name = "message" ) val message: String?,
    @field:Json(name = "data" ) val code: String?
)
