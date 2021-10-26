package br.com.example.navigation

import android.content.Context
import android.content.Intent
import javax.inject.Inject
import javax.inject.Provider

typealias IntentResolverMap = Map<Class<out NavDirection>, @JvmSuppressWildcards Provider<IntentResolver<*>>>

interface INavigator {
    fun createIntent(context: Context, key: NavDirection): Intent
}

class Navigator @Inject constructor(
    private val intentResolvers: IntentResolverMap
) : INavigator {

    @Suppress("UNCHECKED_CAST")
    override fun createIntent(context: Context, key: NavDirection): Intent {
        val resolver = intentResolvers[key::class.java]?.get() as? IntentResolver<NavDirection>
        return resolver?.getIntent(context, key) ?: throw IllegalStateException("Cannot resolve intent key $key")
    }
}