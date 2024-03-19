package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
data class Hours(
    val message: String,
    val hoursList: List<HourItem>
)

data class HourItem(
    val hourCode: String,
    val hour: String
)