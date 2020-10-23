package idsoftsource.kmm.imatchcodebase.di.module;

import dagger.Module
import dagger.Provides
import idsoftsource.kmm.data.Login.repository.Repository
import idsoftsource.kmm.domain.Login.LoginUseCase
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton

@Module
class UseCaseModule {
    @Provides
    @Singleton
    @Named("ioScheduler")
    internal fun provideIoScheduler() = Schedulers.io()

    @Provides
    @Singleton
    @Named("mainThreadScheduler")
    internal fun provideMainThreadScheduler() = AndroidSchedulers.mainThread()

    @Provides
    @Singleton
    internal fun provideLoginUsecase(repository: Repository, @Named("ioScheduler") ioScheduler: Scheduler, @Named("mainThreadScheduler") mainThreadScheduler: Scheduler):LoginUseCase=
        LoginUseCase(repository,ioScheduler,mainThreadScheduler)
}