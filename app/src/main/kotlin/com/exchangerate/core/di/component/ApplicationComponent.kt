package com.exchangerate.core.di.component

import com.exchangerate.core.ExchangeRateApplication
import com.exchangerate.core.data.repository.remote.UsageRepository
import com.exchangerate.core.di.module.ApplicationModule
import com.exchangerate.core.di.module.NetworkModule
import com.exchangerate.core.di.module.RepositoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        NetworkModule::class,
        RepositoryModule::class
))
interface ApplicationComponent {

    fun application(): ExchangeRateApplication

    fun usageRepository(): UsageRepository

}