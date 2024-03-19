package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiDailyJobOrders(
    @field:Json(name = "message") val message: String?,
    @field:Json(name = "data") val data: ApiDailyJOData?,
)

@JsonClass(generateAdapter = true)
data class ApiDailyJOData(
    @field:Json(name = "nextCustomer") val nextJobOrder: ApiJobOrder?,
    @field:Json(name = "notConfirmed") val notConfirmedCustomers: List<ApiJobOrder>?,
)

@JsonClass(generateAdapter = true)
data class ApiJobOrder(
    @field:Json(name = "CustomerAraName") val customerAraName: String?,
    @field:Json(name = "technical_trust_location") val isTrustLocation: Boolean?,
    @field:Json(name = "AreaAraName") val areaAraName: String?,
    @field:Json(name = "service") val service: String?,
    @field:Json(name = "customer_id") val customerId: String?,
    @field:Json(name = "process_id") val processId: String?,
    @field:Json(name = "transcode") val transCode: String?,
    @field:Json(name = "iscollecting") val isCollecting: String?,
    @field:Json(name = "CollectAddress") val collectAddress: String?,
    @field:Json(name = "InstallAddress") val installAddress: String?,
    @field:Json(name = "serial") val serial: String?,
    @field:Json(name = "transyear") val transYear: String?,
    @field:Json(name = "hour_sort") val hourSort: String?,
    @field:Json(name = "Hour") val hour: String?,
    @field:Json(name = "Technical") val technical: String?,
    @field:Json(name = "web_is_sort") val webIsSort: String?,
    @field:Json(name = "web_sort") val webSort: String?,
    @field:Json(name = "web_status") val webStatus: String?,
    @field:Json(name = "specific_customer") val specificCustomer: String?,
    @field:Json(name = "Distday_Det_fromhr") val distdayDetFromhr: String?,
    @field:Json(name = "Location") val location: String?,
    @field:Json(name = "date") val date: String?,
    @field:Json(name = "address") val address: String?,
    @field:Json(name = "loactionsActive") val locationsActive: ApiLocation?,
)

@JsonClass(generateAdapter = true)
data class ApiLocation(
    @field:Json(name = "lat") val lat: Double?,
    @field:Json(name = "lng") val lng: Double?,
//    @field:Json(name = "status") val status: String?,
)