package com.example.loginassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER_VERTICAL
        layout.setPadding(16, 16, 16, 16)

        val titleTextView = TextView(this)
        titleTextView.text = "                     Login"
        titleTextView.textSize = 30f
        layout.addView(titleTextView)

        val emailEditText = EditText(this)
        emailEditText.hint = "Enter your email"
        val emailLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        emailLayoutParams.topMargin = 24
        emailEditText.layoutParams = emailLayoutParams
        layout.addView(emailEditText)

        val passwordEditText = EditText(this)
        passwordEditText.hint = "Enter password"
        passwordEditText.inputType = android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
        val passwordLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        passwordLayoutParams.topMargin = 16
        passwordEditText.layoutParams = passwordLayoutParams
        layout.addView(passwordEditText)

        val loginButton = Button(this)
        loginButton.text = "Login"
        loginButton.textSize = 20f
        val loginButtonLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        loginButtonLayoutParams.topMargin = 32
        loginButtonLayoutParams.gravity = Gravity.CENTER_HORIZONTAL
        loginButton.layoutParams = loginButtonLayoutParams
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()


            if (email =="viswas456@gmail.com" && password == "yourpassword") {
                Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show()
            } else {

            }
        }
        layout.addView(loginButton)

        setContentView(layout)
    }
}
