package br.com.example.navigationexample

import android.os.Bundle
import br.com.example.navigation.INavigator
import br.com.example.navigation.keys.ModuleAIntentKey
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var navigator: INavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(navigator.createIntent(this, ModuleAIntentKey))
        finish()
    }
}