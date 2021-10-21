package br.com.example.navigation

import br.com.example.certificabio.navigation.IntentKey
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class IntentResolverKey(val clazz: KClass<out IntentKey>)
