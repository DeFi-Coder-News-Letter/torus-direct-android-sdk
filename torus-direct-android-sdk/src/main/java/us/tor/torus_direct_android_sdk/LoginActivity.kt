package us.tor.torus_direct_android_sdk

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {

    companion object {
        val LOGIN_TYPE = "Login_Type"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    private fun finishAndReturnResult() {
        finish()
        setResult(Activity.RESULT_OK, Intent())
    }
}