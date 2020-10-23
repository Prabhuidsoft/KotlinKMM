package idsoftsource.kmm.imatchcodebase.di.component

import android.content.Context
import dagger.Component
import idsoftsource.kmm.data.EndPoint
import idsoftsource.kmm.domain.Login.LoginUseCase
import idsoftsource.kmm.imatchcodebase.App
import idsoftsource.kmm.imatchcodebase.di.module.AppModule
import idsoftsource.kmm.imatchcodebase.di.module.IOModule
import idsoftsource.kmm.imatchcodebase.di.module.RepositoryModule
import idsoftsource.kmm.imatchcodebase.di.module.UseCaseModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,IOModule::class,RepositoryModule::class,UseCaseModule::class])
interface AppComponent {
    fun inject(app: App)
    fun getApplicationContext(): Context
    fun getEndpoint(): EndPoint
    fun getLoginUseCase():LoginUseCase
}