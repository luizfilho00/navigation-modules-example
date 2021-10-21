package br.com.example.navigation

import android.content.Context
import android.content.Intent

interface IntentResolver<in KeyT : IntentKey> {
    fun getIntent(context: Context, key: KeyT): Intent
}