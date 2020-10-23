package idsoftsource.kmm.imatchcodebase.Login;

import idsoftsource.kmm.data.Login.model.User
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver

class LoginObserver(private val loginPresenter: LoginPresenter): DisposableSingleObserver<User>() {
    override fun onSuccess(t: User){
     loginPresenter.AccessLogin(t)
    }

    override fun onError(e: Throwable) {
        TODO("Not yet implemented")
    }

}