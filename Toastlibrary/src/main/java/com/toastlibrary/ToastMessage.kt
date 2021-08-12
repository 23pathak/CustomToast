package com.toastlibrary

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast


class ToastMessage {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun toast(context: Context?,message: String?) {
        val toast = Toast(context)
        val view: View = LayoutInflater.from(context).inflate(R.layout.custom_toast, null)
        val textView = view.findViewById<View>(R.id.custom_toast_text) as TextView
        textView.text = message
        toast.setView(view)
        toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.show()
    }
}