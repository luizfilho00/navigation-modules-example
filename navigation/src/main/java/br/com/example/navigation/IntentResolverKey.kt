package br.com.example.navigation

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class IntentResolverKey(val clazz: KClass<out NavDirection>)
