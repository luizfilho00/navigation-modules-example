package br.com.example.navigation

import dagger.Binds
import dagger.Module

@Module
abstract class NavigatorModule {

    @Binds
    abstract fun bindsNavigator(impl: Navigator): INavigator
}