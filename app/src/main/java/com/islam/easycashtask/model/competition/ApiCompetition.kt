package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.Area
import com.islam.easycashtask.model.CurrentSeason
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiCompetitionList(

        @field:Json(name = "competition") val competition: ApiCompetition?,
        @field:Json(name = "competitions") val competitions: List<ApiCompetition>?,
)

@JsonClass(generateAdapter = true)
data class ApiCompetition(
        @field:Json(name = "area") val area: Area?,
        @field:Json(name = "code") val code: String?,
        @field:Json(name = "currentSeason") val currentSeason: CurrentSeason?,
        @field:Json(name = "emblem") val emblem: String?,
        @field:Json(name = "id") val id: Int?,
        @field:Json(name = "lastUpdated") val lastUpdated: String?,
        @field:Json(name = "name") val name: String?,
        @field:Json(name = "numberOfAvailableSeasons") val numberOfAvailableSeasons: Int?,
        @field:Json(name = "plan") val plan: String?,
        @field:Json(name = "type") val type: String?
)