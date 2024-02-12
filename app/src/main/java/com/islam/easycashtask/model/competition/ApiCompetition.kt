package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiInstallationPaymentParams(
        @field:Json(name = "serial") val serial: Int?,
        @field:Json(name = "transcode") val transCode: Int?,
        @field:Json(name = "transyear") val transYear: Int?,
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
        @field:Json(name = "status") val status: String?,
        @field:Json(name = "data") val data: ApiWorkStateData?,
)

@JsonClass(generateAdapter = true)
data class ApiWorkStateData(
        @field:Json(name = "status") val status: String?,
)
