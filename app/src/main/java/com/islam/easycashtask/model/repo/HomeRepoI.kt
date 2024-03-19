package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.DetailsResponse

interface HomeRepoI {
    suspend fun arrivedToClientLocation(): String
}
