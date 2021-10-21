package br.com.example.navigation

import android.content.Context
import android.content.Intent
import br.com.example.certificabio.navigation.IntentKey

interface IntentResolver<in KeyT : IntentKey> {
    fun getIntent(context: Context, key: KeyT): Intent
}