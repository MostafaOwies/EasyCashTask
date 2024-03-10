package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.RecorrectLocationParams
import com.islam.easycashtask.model.competition.CompetitionAPI
import retrofit2.HttpException
import javax.inject.Inject

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
) : HomeRepoI {
    override suspend fun reCorrectLocationApi() {
        try {
             competitionAPI.correctLocation(
                RecorrectLocationParams(9394,1, true, "31.157994", "30.26548")
            )
        } catch (exception: HttpException) {
            throw (exception)
        }
    }
}
