package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class CustomersLocationResponse(
    val message: String,
    val customers: List<CustomerLocationData>
)

data class CustomerLocationData(
    val customerAraName: String,
    val service: String,
    val customerId: String,
    val processId: String,
    val transCode: String,
    val isCollecting: String,
    val collectAddress: String,
    val installAddress: String,
    val serial: String,
    val transYear: String,
    val hourSort: String,
    val hour: String,
    val technical: String,
    val webIsSort: String,
    val webSort: String,
    val distdayDetFromhr: String,
    val location: String,
    val date: String,
    val address: String,
    val locationActive: Location,
)


data class Location(
    val lat: Double,
    val long: Double,
//    val status: LocationStatus,
)