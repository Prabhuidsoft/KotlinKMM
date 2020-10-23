package idsoftsource.kmm.imatchcodebase.Login.di.module;

import dagger.Module
import dagger.Provides
import idsoftsource.kmm.domain.Login.LoginUseCase
import idsoftsource.kmm.imatchcodebase.Login.LoginPresenter
import idsoftsource.kmm.mvp.di.PerActivity

@Module
class Loginmodule {
    @PerActivity
    @Provides
    internal fun provideLoginPresenter(loginUseCase: LoginUseCase)=LoginPresenter(loginUseCase)
}