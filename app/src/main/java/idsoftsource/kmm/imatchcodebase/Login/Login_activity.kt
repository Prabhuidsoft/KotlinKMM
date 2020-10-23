package idsoftsource.kmm.imatchcodebase.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import idsoftsource.kmm.data.Login.model.User
import idsoftsource.kmm.imatchcodebase.R
import idsoftsource.kmm.mvp.CleanActivity

class Login_activity :CleanActivity<LoginPresenter>(),LoginView {
    override fun getLayout(): Int = R.layout.activity_login_activity
    override fun initInjector() {
        TODO("Not yet implemented")
    }

    override fun initialiseView() {
        TODO("Not yet implemented")
    }

    override fun AccessLogin(user: User) {
        TODO("Not yet implemented")
    }

}