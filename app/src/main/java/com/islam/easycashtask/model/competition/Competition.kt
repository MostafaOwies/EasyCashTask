package com.islam.easycashtask.model.competition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class SendSmsResponse(
    val message: String,
    val code: String
)

