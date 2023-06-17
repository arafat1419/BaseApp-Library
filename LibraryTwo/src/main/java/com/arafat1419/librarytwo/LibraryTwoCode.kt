package com.arafat1419.librarytwo

import android.content.Context
import android.widget.Toast
import com.arafat1419.corelibrary.CoreCode

object LibraryTwoCode {
    fun doToast(context: Context) {
        Toast.makeText(
            context,
            "This is Library Two with ${CoreCode.getCoreTypes()}",
            Toast.LENGTH_SHORT
        ).show()
    }
}