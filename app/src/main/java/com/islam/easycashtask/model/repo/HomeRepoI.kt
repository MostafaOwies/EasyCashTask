package com.islam.easycashtask.model.repo

import com.islam.easycashtask.model.competition.SendSmsResponse


interface HomeRepoI {
    suspend fun sendSmsToClient(): SendSmsResponse
}
