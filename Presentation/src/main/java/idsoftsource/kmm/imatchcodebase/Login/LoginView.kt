package idsoftsource.kmm.imatchcodebase.Login

import idsoftsource.kmm.data.Login.model.User

interface LoginView {
    fun initialiseView()
    fun AccessLogin(user: User)
}