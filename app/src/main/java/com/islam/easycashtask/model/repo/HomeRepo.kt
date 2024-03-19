package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.ApiArrivedParam
import com.islam.easycashtask.model.competition.CompetitionAPI
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,

    ) : HomeRepoI {
    override suspend fun arrivedToClientLocation(): String {
        try {
            return competitionAPI.arrived(
                ApiArrivedParam(
                    7394,
                    1,
                    "31.157994",
                    "30.264548"
                )
            ).message.orEmpty()
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}