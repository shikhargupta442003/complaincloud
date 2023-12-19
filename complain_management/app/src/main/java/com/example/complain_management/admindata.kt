package com.example.complain_management

data class admindata(
    var email:String?= null,
    var name:String?= null,
    var number:String?= null,
    var organizationname:String?= null,
    var uid:String?=null,
    var admin_services: List<String?>? = null,
)
