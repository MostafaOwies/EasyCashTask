package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.Hours


interface HomeRepoI {
    suspend fun getHours(): Hours
}
