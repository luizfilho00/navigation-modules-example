package br.com.example.moduleb

import br.com.example.navigation.IntentResolver
import br.com.example.navigation.IntentResolverKey
import br.com.example.navigation.keys.ModuleBIntentKey
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ActivityBModule {

    @ContributesAndroidInjector
    abstract fun bindsActivity(): ModuleBActivity

    companion object {
        @Provides
        @IntoMap
        @IntentResolverKey(ModuleBIntentKey::class)
        fun providesIntentResolver(): IntentResolver<*> = ModuleBActivity
    }
}