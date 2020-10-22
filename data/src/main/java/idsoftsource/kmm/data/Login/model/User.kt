package idsoftsource.kmm.data.Login.model;

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User (
 @SerializedName("failed")
 @Expose
 var failed:String?=null,
 @SerializedName("message")
 @Expose
 var message:String?=null,
 @SerializedName("userId")
 @Expose
 var userId:String?=null,
 @SerializedName("token")
 @Expose
 var token:String?=null,
 @SerializedName("claims")
 @Expose
 var claims:String?=null
)