package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiSaveParams
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.PromissoryItem
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
) : HomeRepoI {
    override suspend fun save(): String {
        try {
            return competitionAPI.save(
                ApiSaveParams(
                    customerId = 113501,
                    transyear = 2024,
                    transcode = 821,
                    serial = 112,
                    hourCode = 0,
                    promissories = listOf(
                        PromissoryItem(
                            serial = 0,
                            code = 0,
                            date="05",
                            year = 0
                        )
                    ),
                    lat = "31.455455",
                    lng = "31.48512"
                )
            ).message.orEmpty()
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
