package com.islam.easycashtask.domain.usecases

import com.islam.easycashtask.model.competition.CustomersLocationResponse
import com.islam.easycashtask.model.repo.HomeRepoI
import javax.inject.Inject

class GetCompetitions @Inject constructor(
    private val homeRepository: HomeRepoI,
) {
    suspend operator fun invoke(): CustomersLocationResponse {
        return homeRepository.getCustomersLocation()
    }
}