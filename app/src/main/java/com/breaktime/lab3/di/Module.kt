package com.breaktime.lab3.di

import com.breaktime.lab3.firebase.Firebase
import com.breaktime.lab3.view.first_enter.FirstEnterViewModel
import com.breaktime.lab3.view.home.HomeViewModel
import com.breaktime.lab3.view.login.LoginViewModel
import com.breaktime.lab3.view.menu.MenuViewModel
import com.breaktime.lab3.view.photo.PhotoViewModel
import com.breaktime.lab3.view.profile.ProfileViewModel
import com.breaktime.lab3.view.registration.RegistrationViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import org.koin.dsl.module

val appModule = module {
    single { FirebaseAuth.getInstance() }
    single { FirebaseDatabase.getInstance("https://relax-app-7b00c-default-rtdb.firebaseio.com/") }
    single { FirebaseStorage.getInstance() }
    single { Firebase(get(), get(), get()) }
    single { RegistrationViewModel(get()) }
    single { LoginViewModel(get()) }
    single { ProfileViewModel(get()) }
    single { PhotoViewModel(get()) }
    single { HomeViewModel(get()) }
    single { MenuViewModel() }
    single { FirstEnterViewModel(get()) }
}