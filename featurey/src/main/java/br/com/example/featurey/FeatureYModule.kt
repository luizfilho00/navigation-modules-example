package br.com.example.featurey

import br.com.example.directions.FeatureYNavDirection
import br.com.example.navigation.IntentResolver
import br.com.example.navigation.IntentResolverKey
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class FeatureYModule {

    @ContributesAndroidInjector
    abstract fun bindsActivity(): FeatureYActivity

    companion object {
        @Provides
        @IntoMap
        @IntentResolverKey(FeatureYNavDirection::class)
        fun providesIntentResolver(): IntentResolver<*> = FeatureYActivity
    }
}