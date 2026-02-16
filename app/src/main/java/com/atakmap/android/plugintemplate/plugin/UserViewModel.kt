package com.atakmap.android.plugintemplate.plugin

class UserViewModel(private val userService: UserService) {

    init {
        userService.loadUsers()
    }

    fun sayHello(name: String): String {
        val user = userService.getUserOrNull(name)
        val message = userService.prepareHelloMessage(user)
        return "[UserViewModel] $message"
    }
}