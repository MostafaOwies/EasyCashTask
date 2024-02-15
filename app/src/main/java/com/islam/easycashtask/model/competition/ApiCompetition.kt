package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiPostponeParam(
        @field:Json(name = "customerId") val customerId: Int,
        @field:Json(name = "transyear") val year: Int,
        @field:Json(name = "transcode") val code: Int,
        @field:Json(name = "serial") val serial: Int,
        @field:Json(name = "hourCode") val hCode: Int
)

@JsonClass(generateAdapter = true)
data class ApiCompetitionList(

        @field:Json(name = "message") val message: String?,
        @field:Json(name = "data") val data: ApiCompetition?,
)

@JsonClass(generateAdapter = true)
data class ApiCompetition(
        @field:Json(name = "deviceName") val deviceName: String?,
        @field:Json(name = "devicePrice") val devicePrice: String?,
        @field:Json(name = "paymentMethod") val paymentMethod: String?,
        @field:Json(name = "amountOfInstallement") val amountOfInstallment: String?,
        @field:Json(name = "numberOfInstallement") val numberOfInstallment: String?,
        @field:Json(name = "depositWhenInstallement") val depositWhenInstallment: String?,
        @field:Json(name = "depositCollecting") val depositCollecting: String?,
        @field:Json(name = "ernast") val ernast: String?,
)

@JsonClass(generateAdapter = true)
data class ApiWorkState(
        @field:Json(name = "message") val message: String?,
        @field:Json(name = "data") val data: ApiWorkStateData?,
)

@JsonClass(generateAdapter = true)
data class ApiWorkStateData(
        @field:Json(name = "status") val status: String?,
        @field:Json(name = "details") val details: ApiWorkStateDetails?,
)

@JsonClass(generateAdapter = true)
data class ApiWorkStateDetails(
        @field:Json(name = "id") val id: String?,
        @field:Json(name = "date") val date: String?,
        @field:Json(name = "start_time") val startTime: String?,
        @field:Json(name = "request_end_time") val requestEndTime: String?,
        @field:Json(name = "end_time") val endTime: String?,
)