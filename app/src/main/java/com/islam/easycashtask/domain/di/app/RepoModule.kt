package com.islam.easycashtask.domain.di.app

import com.islam.easycashtask.model.repo.HomeRepo
import com.islam.easycashtask.model.repo.HomeRepoI
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    abstract fun bindHomeRepository(repository: HomeRepo): HomeRepoI
}