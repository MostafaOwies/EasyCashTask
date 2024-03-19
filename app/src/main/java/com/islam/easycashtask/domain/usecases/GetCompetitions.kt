package com.islam.easycashtask.domain.usecases

import com.islam.easycashtask.model.competition.SendSmsResponse
import com.islam.easycashtask.model.repo.HomeRepoI
import javax.inject.Inject

class GetCompetitions @Inject constructor(
    private val homeRepository: HomeRepoI,
) {
    suspend operator fun invoke(): SendSmsResponse {
        return homeRepository.sendSmsToClient()
    }
}