package idsoftsource.kmm.domain.Login.models

import android.net.Uri

data class User(var failed:String?=null,
                var message:String?=null,
                var userId:String?=null,
                var token:String?=null,
                var claims:String?=null
)
