package com.example.assessmenttask.di.app

import android.app.Application
import android.content.Context
import com.google.gson.Gson
import com.islam.easycashtask.domain.di.RetrofitQ
import com.islam.easycashtask.domain.UrlProvider
import com.islam.easycashtask.model.competition.CompetitionAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @AppScope
    @RetrofitQ
    fun provideRetrofit(urlProvider: UrlProvider): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlProvider.getBaseUrl())
            .client(
                OkHttpClient.Builder().addInterceptor { chain ->
                    val request = chain.request().newBuilder()
                        .addHeader("X-Auth-Token", "be846a379d404a53ad0f6099bca94f4e")
                        .build()
                    chain.proceed(request)
                }.build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @AppScope
    fun urlProvider() = UrlProvider()

    @Provides
    @AppScope
    fun competitionAPI(@RetrofitQ retrofit: Retrofit): CompetitionAPI = retrofit.create(
        CompetitionAPI::class.java
    )

    @Provides
    @AppScope
    fun provideApplicationContext(application: Application): Context {
        return application.applicationContext
    }

}