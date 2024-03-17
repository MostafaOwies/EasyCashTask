package com.islam.easycashtask.domain.usecases

import com.islam.easycashtask.model.competition.DetailsResponse
import com.islam.easycashtask.model.repo.HomeRepoI
import javax.inject.Inject

class GetCompetitions @Inject constructor(
    private val homeRepoI: HomeRepoI,
) {
    suspend operator fun invoke(): DetailsResponse {
        return homeRepoI.reCorrectLocationApi()
    }
}