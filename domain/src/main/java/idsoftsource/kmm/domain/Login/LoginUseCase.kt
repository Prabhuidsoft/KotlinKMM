package idsoftsource.kmm.domain.Login;

import idsoftsource.kmm.data.Login.repository.Repository
import idsoftsource.kmm.domain.Login.models.User
import idsoftsource.kmm.domain.UseCase
import io.reactivex.Scheduler
import io.reactivex.Single
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: Repository,subscribeScheduler: Scheduler,
                                       postExecutionScheduler: Scheduler):UseCase<User,Unit>(subscribeScheduler,postExecutionScheduler){
    override fun buildUseCaseSingle(params: Unit?): Single<User> = repository.Athentication()
            .map{
                it.run { User() }
           }

}