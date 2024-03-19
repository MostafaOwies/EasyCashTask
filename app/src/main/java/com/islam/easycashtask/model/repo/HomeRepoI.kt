package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.CustomersLocationResponse


interface HomeRepoI {
    suspend fun getCustomersLocation(): CustomersLocationResponse
}
