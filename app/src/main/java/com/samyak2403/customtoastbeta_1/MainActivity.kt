package com.samyak2403.customtoastbeta_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.samyak2403.custom_toast.TastyToast.tastyError
import com.samyak2403.custom_toast.TastyToast.tastyInfo
import com.samyak2403.custom_toast.TastyToast.tastySuccess
import com.samyak2403.custom_toast.TastyToast.tastyWarning
import com.samyak2403.customtoastbeta_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




            allToast()




        // Success toast
        tastySuccess("Data saved successfully!")
    }

    private fun allToast() {
        binding.btnPrimary.setOnClickListener {
            tastySuccess("Data saved successfully!")
        }

        binding.btnSecondary.setOnClickListener {
            tastySuccess("Data saved successfully!")
        }

        binding.btnSuccess.setOnClickListener {
            tastySuccess("Data saved successfully!")
        }

        binding.btnError.setOnClickListener {
            tastyError("Data Not Saved!")
        }

        binding.btnWarning.setOnClickListener {
            tastyWarning("Data Deleted!")
        }

        binding.btnDisabled.setOnClickListener {
            tastyInfo("Database Disabled!")
        }


    }
}