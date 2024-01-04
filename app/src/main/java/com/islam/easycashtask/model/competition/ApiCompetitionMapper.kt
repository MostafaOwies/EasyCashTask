package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.ApiMapper
import com.islam.easycashtask.model.Area
import com.islam.easycashtask.model.CurrentSeason
import com.islam.easycashtask.model.Winner
import javax.inject.Inject

class ApiCompetitionMapper @Inject constructor() : ApiMapper<ApiCompetitionList, CompetitionList> {
    override fun mapToDomain(apiEntity: ApiCompetitionList): CompetitionList {

        return CompetitionList(
            competition = mapCompetition(apiEntity.competition),
            competitions = apiEntity.competitions?.map {
                mapCompetition(it)
            }.orEmpty()
        )

    }

    private fun mapCompetition(apiCompetition: ApiCompetition?): Competition {
        return Competition(
            area = Area(
                code = apiCompetition?.area?.code.orEmpty(),
                flag = apiCompetition?.area?.flag.orEmpty(),
                id = apiCompetition?.area?.id ?: 0,
                name = apiCompetition?.area?.name.orEmpty(),
            ),
            code = apiCompetition?.code.orEmpty(),
            currentSeason = CurrentSeason(
                currentMatchday = apiCompetition?.currentSeason?.currentMatchday ?: 0,
                endDate = apiCompetition?.currentSeason?.endDate.orEmpty(),
                startDate = apiCompetition?.currentSeason?.startDate.orEmpty(),
                id = apiCompetition?.currentSeason?.currentMatchday ?: 0,
                winner = Winner(
                    address = apiCompetition?.currentSeason?.winner?.address.orEmpty(),
                    clubColors = apiCompetition?.currentSeason?.winner?.clubColors.orEmpty(),
                    crest = apiCompetition?.currentSeason?.winner?.crest.orEmpty(),
                    founded = apiCompetition?.currentSeason?.winner?.founded ?: 0,
                    id = apiCompetition?.currentSeason?.winner?.id ?: 0,
                    lastUpdated = apiCompetition?.currentSeason?.winner?.lastUpdated.orEmpty(),
                    name = apiCompetition?.currentSeason?.winner?.name.orEmpty(),
                    shortName = apiCompetition?.currentSeason?.winner?.shortName.orEmpty(),
                    tla = apiCompetition?.currentSeason?.winner?.tla.orEmpty(),
                    venue = apiCompetition?.currentSeason?.winner?.venue.orEmpty(),
                    website = apiCompetition?.currentSeason?.winner?.website.orEmpty(),
                )
            ),
            emblem = apiCompetition?.emblem.orEmpty(),
            id = apiCompetition?.id ?: 0,
            lastUpdated = apiCompetition?.lastUpdated.orEmpty(),
            name = apiCompetition?.name.orEmpty(),
            numberOfAvailableSeasons = apiCompetition?.numberOfAvailableSeasons ?: 0,
            plan = apiCompetition?.plan.orEmpty(),
            type = apiCompetition?.type.orEmpty(),
        )
    }
}
