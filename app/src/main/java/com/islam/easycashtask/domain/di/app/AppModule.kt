package com.example.assessmenttask.di.app

import android.app.Application
import android.content.Context
import com.islam.easycashtask.domain.di.RetrofitQ
import com.islam.easycashtask.domain.UrlProvider
import com.islam.easycashtask.model.competition.CompetitionAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @AppScope
    fun providesLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC)
        return logging
    }

    @Provides
    @AppScope
    fun providesOkHttpClient(okHttpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(okHttpLoggingInterceptor)
            .build()
    }



    @Provides
    @AppScope
    @RetrofitQ
    fun provideRetrofit(okHttpClient: OkHttpClient,urlProvider: UrlProvider): Retrofit {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).client(okHttpClient)
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .baseUrl(urlProvider.getBaseUrl())
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