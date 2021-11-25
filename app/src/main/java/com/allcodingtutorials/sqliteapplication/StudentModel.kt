package com.allcodingtutorials.sqliteapplication

import java.util.*

data class StudentModel(
    var id: Int = getAutoId(),
    var name: String = "",
    var email: String = ""
){
    companion object
    fun getAutoId():Int{
        val random = Random()
        return random.nextInt(100)
    }
}
