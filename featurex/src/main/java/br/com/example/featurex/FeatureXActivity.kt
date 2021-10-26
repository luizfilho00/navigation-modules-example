package br.com.example.featurex

import android.content.Context
import android.content.Intent
import android.os.Bundle
import br.com.example.directions.FeatureXNavDirection
import br.com.example.directions.FeatureYNavDirection
import br.com.example.navigation.INavigator
import br.com.example.navigation.IntentResolver
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_feature_x.*
import javax.inject.Inject

class FeatureXActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var navigator: INavigator

    companion object : IntentResolver<FeatureXNavDirection> {
        const val FIRST_VALUE_EXTRA = "FIRST_VALUE_EXTRA"
        const val SECOND_VALUE_EXTRA = "SECOND_VALUE_EXTRA"
        const val THIRD_VALUE_EXTRA = "THIRD_VALUE_EXTRA"

        override fun getIntent(context: Context, key: FeatureXNavDirection): Intent {
            return Intent(context, FeatureXActivity::class.java).apply {
                key.firstValue?.let { putExtra(FIRST_VALUE_EXTRA, it) }
                key.secondValue?.let { putExtra(SECOND_VALUE_EXTRA, it) }
                key.thirdValue?.let { putExtra(THIRD_VALUE_EXTRA, it) }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_x)
        button.setOnClickListener {
            startActivity(navigator.createIntent(this, FeatureYNavDirection))
            finish()
        }
    }
}