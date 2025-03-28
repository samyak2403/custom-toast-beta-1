package com.samyak2403.custom_toast

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.DrawableRes

object TastyToast {

    // Toast types with icons and backgrounds
    enum class Type(
        @DrawableRes val icon: Int,
        @DrawableRes val background: Int
    ) {
        SUCCESS(
            R.drawable.ic_success,
            R.drawable.bg_toast_success
        ),
        ERROR(
            R.drawable.ic_error,
            R.drawable.bg_toast_error
        ),
        WARNING(
            R.drawable.ic_warning,
            R.drawable.bg_toast_warning
        ),
        INFO(
            R.drawable.ic_info,
            R.drawable.bg_toast_info
        ),
        DEFAULT(
            R.drawable.ic_default,
            R.drawable.bg_toast_default
        )
    }

    // Main function to show toast
    fun show(
        context: Context,
        message: String,
        type: Type = Type.DEFAULT,
        duration: Int = Toast.LENGTH_SHORT
    ) {
        val toast = Toast(context)
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.layout_custom_toast, null)

        // Customize toast
        view.apply {
            findViewById<LinearLayout>(R.id.toast_layout).setBackgroundResource(type.background)
            findViewById<ImageView>(R.id.toast_icon).setImageResource(type.icon)
            findViewById<TextView>(R.id.toast_text).text = message
        }

        toast.apply {
            setView(view)
            setDuration(duration)
            show()
        }
    }

    // Extension functions for easy usage
    fun Context.tastyToast(message: String, type: Type = Type.DEFAULT) =
        show(this, message, type)

    fun Context.tastySuccess(message: String) = show(this, message, Type.SUCCESS)
    fun Context.tastyError(message: String) = show(this, message, Type.ERROR)
    fun Context.tastyWarning(message: String) = show(this, message, Type.WARNING)
    fun Context.tastyInfo(message: String) = show(this, message, Type.INFO)
}