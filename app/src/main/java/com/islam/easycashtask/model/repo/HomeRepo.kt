package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.HourItem
import com.islam.easycashtask.model.competition.Hours
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,


    ) : HomeRepoI {
    override suspend fun getHours(): Hours {
        try {
            val (message, list) = competitionAPI.getHours()
            return Hours(
                message = message.orEmpty(),
                hoursList = list?.map {
                    HourItem(
                        hour = it.hour.orEmpty(),
                        hourCode = it.hourCode.orEmpty()
                    )
                }.orEmpty()
            )
        } catch (exception: HttpException) {
            throw (exception)
        }
    }

}