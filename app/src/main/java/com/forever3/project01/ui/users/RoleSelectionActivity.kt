package com.forever3.project01.ui.users

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.forever3.project01.R

import android.content.Intent
import android.widget.Button


class RoleSelectionActivity : AppCompatActivity() {

    private lateinit var btnGoLector: Button
    private lateinit var btnGoInvestigator: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_role_selection)

        btnGoLector.setOnClickListener {
            goToRegisterInvestigatorActivity()
        }

        btnGoInvestigator.setOnClickListener {
            goToRegisterLectorActivity()
        }

    }

    //redirigiendo a seleccionar el role
    private fun goToRegisterLectorActivity() {
        //val intent = Intent(this, RegisterLectorActivity::class.java)
        startActivity(intent)
    }

    //redirigiendo a seleccionar el role
    private fun goToRegisterInvestigatorActivity() {
        //val intent = Intent(this, RegisterInvestigatorActivity::class.java)
        startActivity(intent)
    }

}