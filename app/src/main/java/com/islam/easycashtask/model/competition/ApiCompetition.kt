package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiSaveParams(
    @field:Json(name = "customerId") val customerId: Int,
    @field:Json(name = "transyear") val transyear: Int,
    @field:Json(name = "transcode") val transcode: Int,
    @field:Json(name = "serial") val serial: Int,
    @field:Json(name = "hourCode") val hourCode: Int,
    @field:Json(name = "promissories") val promissories: List<PromissoryItem>,
    @field:Json(name = "lat") val lat: Long,
    @field:Json(name = "lng") val lng: Long,
)

@JsonClass(generateAdapter = true)
data class PromissoryItem(
    @field:Json(name = "serial") val serial: Int,
    @field:Json(name = "code") val code: Int,
    @field:Json(name = "date") val date: String,
    @field:Json(name = "year") val year: Int,
)