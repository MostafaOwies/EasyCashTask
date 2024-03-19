package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.DailyJobOrders

interface HomeRepoI {
    suspend fun getDailyJobOrders(): DailyJobOrders
}
