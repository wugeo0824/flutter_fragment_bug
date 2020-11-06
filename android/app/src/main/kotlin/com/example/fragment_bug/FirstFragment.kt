package com.example.fragment_bug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment(
        private val bugNavigator: BugNavigator
) : Fragment() {

    companion object {
        const val TAG = "FirstFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.first_fragment, container, false)
        val button = root.findViewById<Button>(R.id.btn_add_flutter)
        button.setOnClickListener {
            bugNavigator.openFlutterFragment()
        }

        return root
    }

}