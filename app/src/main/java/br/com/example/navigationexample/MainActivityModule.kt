package br.com.example.navigationexample

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @ContributesAndroidInjector
    fun bindsMainActivity(): MainActivity
}