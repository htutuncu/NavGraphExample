package com.example.navgraphexample

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class LoginFragment : Fragment(R.layout.fragment_login) {

    private val args: LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val usernameDeeplink = args.username
        view.findViewById<EditText>(R.id.etUsername).setText(usernameDeeplink.toString())

        super.onViewCreated(view, savedInstanceState)
    }

}