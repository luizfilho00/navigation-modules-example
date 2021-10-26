package br.com.example.featurex

import br.com.example.directions.FeatureXNavDirection
import br.com.example.navigation.IntentResolver
import br.com.example.navigation.IntentResolverKey
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class FeatureXModule {

    @ContributesAndroidInjector
    abstract fun bindsActivity(): FeatureXActivity

    companion object {
        @Provides
        @IntoMap
        @IntentResolverKey(FeatureXNavDirection::class)
        fun providesIntentResolver(): IntentResolver<*> = FeatureXActivity
    }
}