package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.Area
import com.islam.easycashtask.model.CurrentSeason

data class CompetitionList(

        val competition: Competition,
        val competitions: List<Competition>,
)

data class Competition(
        val area: Area,
        val code: String,
        val currentSeason: CurrentSeason,
        val emblem: String,
        val id: Int,
        val lastUpdated: String,
        val name: String,
        val numberOfAvailableSeasons: Int,
        val plan: String,
        val type: String
)
