package com.example.fragment_bug

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import io.flutter.embedding.android.FlutterFragment

class MainActivity: FragmentActivity(), BugNavigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val firstFragment = supportFragmentManager.findFragmentByTag(FirstFragment.TAG)
        if (firstFragment == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.container, FirstFragment(this), FirstFragment.TAG)
                    .commit()
        }
    }

    override fun openFlutterFragment() {
        val flutterFragment = FlutterFragment.createDefault()
        supportFragmentManager.beginTransaction()
                .add(R.id.container, flutterFragment, FirstFragment.TAG)
                .commit()
    }
}
