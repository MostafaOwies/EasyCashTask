package com.islam.easycashtask.model.repo

import android.content.ContentValues.TAG
import android.util.Log
import com.islam.easycashtask.model.competition.ApiCheckWorkStatusMapper
import com.islam.easycashtask.model.competition.ApiCompetitionMapper
import com.islam.easycashtask.model.competition.ApiReturnParam
import com.islam.easycashtask.model.competition.CompetitionAPI
import com.islam.easycashtask.model.competition.CompetitionList
import com.islam.easycashtask.model.competition.WorkState
import retrofit2.HttpException
import javax.inject.Inject
import kotlin.math.log

class HomeRepo @Inject constructor(
    private val competitionAPI: CompetitionAPI,
) : HomeRepoI {
    override suspend fun returnOrder(): String {
        try {
            return competitionAPI.returnOrder(
                ApiReturnParam(
                    customerId = 113992,
                    transcode = 921,
                    transyear = 2024,
                    serial = 1,
                    hourCode = 0
                )
            ).message.orEmpty()
        } catch (exception: HttpException) {
            Log.d(TAG, "returnOrder: $exception")
            throw (exception)
        }
    }
}
