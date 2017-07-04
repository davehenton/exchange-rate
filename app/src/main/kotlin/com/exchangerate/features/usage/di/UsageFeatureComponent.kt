package com.exchangerate.features.usage.di

import com.exchangerate.core.di.component.ApplicationComponent
import com.exchangerate.core.di.scope.ActivityScoped
import com.exchangerate.features.usage.UsageActivity
import dagger.Component

@ActivityScoped
@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(
                UsageFeatureModule::class,
                UsageUseCasesModule::class
        )
)
interface UsageFeatureComponent {

    fun inject(activity: UsageActivity)

}