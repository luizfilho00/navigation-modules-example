package br.com.example.navigation

import android.content.Context
import android.content.Intent
import br.com.example.certificabio.navigation.IntentKey
import javax.inject.Inject
import javax.inject.Provider

typealias IntentResolverMap = Map<Class<out IntentKey>, @JvmSuppressWildcards Provider<IntentResolver<*>>>

interface INavigator {
    fun createIntent(context: Context, key: IntentKey): Intent
}

class Navigator @Inject constructor(
    private val intentResolvers: IntentResolverMap
) : INavigator {

    @Suppress("UNCHECKED_CAST")
    override fun createIntent(context: Context, key: IntentKey): Intent {
        val resolver = intentResolvers[key::class.java]?.get() as? IntentResolver<IntentKey>
        return resolver?.getIntent(context, key) ?: throw IllegalStateException("Cannot resolve intent key $key")
    }
}