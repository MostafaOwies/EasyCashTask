package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class DetailsResponse(
    val message: String?,
    val visit1: VisitD?,
)


data class VisitD(
    val type: String?,
)