package idsoftsource.kmm.imatchcodebase.Login;

import idsoftsource.kmm.data.Login.model.User
import idsoftsource.kmm.domain.Login.LoginUseCase
import idsoftsource.kmm.mvp.CleanPresenter
import javax.inject.Inject

class LoginPresenter @Inject constructor(private val loginUseCase: LoginUseCase): CleanPresenter<LoginView>() {
    override fun initialise() {
        getView()?.initialiseView()
        loginUseCase.execute(LoginObserver(this))
    }

    override fun disposeSubscriptions() {
        TODO("Not yet implemented")
    }

    fun AccessLogin(user: User){
    getView()?.AccessLogin(user)
    }
}