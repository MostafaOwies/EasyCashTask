package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class RecorrectLocationParams(
    @field:Json(name = "customerId") val customerId: Int,
    @field:Json(name = "proccessId") val processId: Int,
    @field:Json(name = "iscollecting") val isCollecting:Boolean ,
    @field:Json(name = "lat") val lat: String,
    @field:Json(name = "lng") val lng: String,
)
