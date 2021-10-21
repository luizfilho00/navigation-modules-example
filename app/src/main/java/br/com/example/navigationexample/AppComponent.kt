package br.com.example.navigationexample

import android.content.Context
import br.com.example.modulea.ActivityAModule
import br.com.example.moduleb.ActivityBModule
import br.com.example.navigation.NavigatorModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        MainActivityModule::class,
        ActivityAModule::class,
        ActivityBModule::class,
        NavigatorModule::class
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