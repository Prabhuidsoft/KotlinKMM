package idsoftsource.kmm.imatchcodebase.di.module;

import dagger.Module
import dagger.Provides
import idsoftsource.kmm.data.EndPoint
import idsoftsource.kmm.data.Login.repository.Repository
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    internal fun provideLoginRepository(endPoint: EndPoint):Repository=Repository(endPoint)
}