package br.com.example.featurey

import android.content.Context
import android.content.Intent
import android.os.Bundle
import br.com.example.directions.FeatureXNavDirection
import br.com.example.directions.FeatureYNavDirection
import br.com.example.navigation.INavigator
import br.com.example.navigation.IntentResolver
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_feature_y.*
import javax.inject.Inject

class FeatureYActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var navigator: INavigator

    companion object : IntentResolver<FeatureYNavDirection> {
        override fun getIntent(context: Context, key: FeatureYNavDirection): Intent {
            return Intent(context, FeatureYActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_y)
        button.setOnClickListener {
            startActivity(navigator.createIntent(this, FeatureXNavDirection(firstValue = "test")))
            finish()
        }
    }
}