package idsoftsource.kmm.data.Login.repository;

import idsoftsource.kmm.data.EndPoint
import idsoftsource.kmm.data.Login.model.User
import io.reactivex.Single
import javax.inject.Inject

class Repository @Inject constructor( private val endPoint: EndPoint){
    fun Athentication(): Single<User> = endPoint.ValidateUser()
        .map { it }
}