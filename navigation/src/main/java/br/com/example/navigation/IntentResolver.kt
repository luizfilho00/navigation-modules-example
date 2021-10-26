package br.com.example.navigation

import android.content.Context
import android.content.Intent

interface IntentResolver<in T : NavDirection> {
    fun getIntent(context: Context, key: T): Intent
}