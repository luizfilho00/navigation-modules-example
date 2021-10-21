package br.com.example.modulea

import android.content.Context
import android.content.Intent
import android.os.Bundle
import br.com.example.navigation.INavigator
import br.com.example.navigation.IntentResolver
import br.com.example.navigation.keys.ModuleAIntentKey
import br.com.example.navigation.keys.ModuleBIntentKey
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_module_a.*
import javax.inject.Inject

class ModuleAActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var navigator: INavigator

    companion object : IntentResolver<ModuleAIntentKey> {
        override fun getIntent(context: Context, key: ModuleAIntentKey): Intent {
            return Intent(context, ModuleAActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_a)
        button.setOnClickListener {
            startActivity(navigator.createIntent(this, ModuleBIntentKey(id = "id")))
            finish()
        }
    }
}