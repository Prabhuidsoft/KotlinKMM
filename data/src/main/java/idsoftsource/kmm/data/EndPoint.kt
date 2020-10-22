package idsoftsource.kmm.data

import idsoftsource.kmm.data.Login.model.User
import io.reactivex.Single
import retrofit2.http.POST

interface EndPoint {

  @POST("$Endpoint/Auth/Login")
  fun ValidateUser():Single<User>
}