package idsoftsource.kmm.imatchcodebase.Login.di.component

import dagger.Component
import dagger.Module
import idsoftsource.kmm.imatchcodebase.Login.Login_activity
import idsoftsource.kmm.imatchcodebase.di.component.AppComponent
import idsoftsource.kmm.imatchcodebase.di.module.AppModule
import idsoftsource.kmm.mvp.di.PerActivity

@PerActivity
@Component(dependencies = [AppComponent::class],modules = [AppModule::class])
interface Logincomponent {
    fun inject(loginActivity: Login_activity)
}