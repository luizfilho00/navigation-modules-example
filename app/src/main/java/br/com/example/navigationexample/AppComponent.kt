package br.com.example.navigationexample

import android.content.Context
import br.com.example.featurex.FeatureXModule
import br.com.example.featurey.FeatureYModule
import br.com.example.navigation.NavigationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        MainActivityModule::class,
        FeatureXModule::class,
        FeatureYModule::class,
        NavigationModule::class
    ]
)
interface AppComponent {

    fun inject(application: NavigationApp): NavigationApp

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}