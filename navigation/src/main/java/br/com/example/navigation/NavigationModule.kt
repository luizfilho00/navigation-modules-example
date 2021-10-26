package br.com.example.navigation

import dagger.Binds
import dagger.Module

@Module
abstract class NavigationModule {

    @Binds
    abstract fun bindsNavigator(impl: Navigator): INavigator
}