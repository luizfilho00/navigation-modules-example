package br.com.example.modulea

import br.com.example.navigation.IntentResolver
import br.com.example.navigation.IntentResolverKey
import br.com.example.navigation.keys.ModuleAIntentKey
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ActivityAModule {

    @ContributesAndroidInjector
    abstract fun bindsActivity(): ModuleAActivity

    companion object {
        @Provides
        @IntoMap
        @IntentResolverKey(ModuleAIntentKey::class)
        fun providesIntentResolver(): IntentResolver<*> = ModuleAActivity
    }
}