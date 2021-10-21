package br.com.example.moduleb

import android.content.Context
import android.content.Intent
import android.os.Bundle
import br.com.example.navigation.INavigator
import br.com.example.navigation.IntentResolver
import br.com.example.navigation.keys.ModuleAIntentKey
import br.com.example.navigation.keys.ModuleBIntentKey
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_module_b.*
import javax.inject.Inject

class ModuleBActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var navigator: INavigator

    companion object : IntentResolver<ModuleBIntentKey> {
        const val EXTRA_ID = "EXTRA_ID"

        override fun getIntent(context: Context, key: ModuleBIntentKey): Intent {
            return Intent(context, ModuleBActivity::class.java).apply {
                putExtra(EXTRA_ID, key.id)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_b)
        button.setOnClickListener {
            startActivity(navigator.createIntent(this, ModuleAIntentKey))
            finish()
        }
    }
}