package com.atakmap.android.plugintemplate.plugin.di

import com.atakmap.android.plugintemplate.plugin.UserRepository
import com.atakmap.android.plugintemplate.plugin.UserRepositoryImpl
import com.atakmap.android.plugintemplate.plugin.UserService
import com.atakmap.android.plugintemplate.plugin.UserServiceImpl
import com.atakmap.android.plugintemplate.plugin.UserViewModel
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> { UserRepositoryImpl() }
    single<UserService> { UserServiceImpl(get()) }
    single { UserViewModel(get()) }
}