package br.com.example.navigationexample

import android.os.Bundle
import br.com.example.directions.FeatureXNavDirection
import br.com.example.navigation.INavigator
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var navigator: INavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(navigator.createIntent(this, FeatureXNavDirection()))
        finish()
    }
}