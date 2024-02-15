package com.islam.easycashtask.model.repo

interface HomeRepoI {

    suspend fun postponeOrder(
        customerId: Int,
        code: Int,
        serial: Int,
        year: Int,
        hCode: Int,
    ): String

}
