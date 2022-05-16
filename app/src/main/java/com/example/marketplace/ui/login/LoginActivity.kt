package com.example.marketplace.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.marketplace.R
import com.example.marketplace.databinding.ActivityLoginBinding
import com.example.marketplace.databinding.FragmentDashboardBinding
import com.example.marketplace.util.Prefs

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val s = Prefs(this)
        if (s.getIslogin()){
            binding.tvStatus.text = "sudah "
        } else  binding.tvStatus.text = "blm"

        binding.btnLogin.setOnClickListener {
          s.setIsLogin(true)
            onBackPressed()
        }
            binding.btnLogout.setOnClickListener {
                s.setIsLogin(false)
                onBackPressed()
            }
        Log.d("RESPOM", "PESAN SINGKAT")
    }
}