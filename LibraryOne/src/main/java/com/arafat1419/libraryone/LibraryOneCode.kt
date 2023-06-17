package com.arafat1419.libraryone

import android.content.Context
import android.widget.Toast
import com.arafat1419.corelibrary.CoreCode

object LibraryOneCode {
    fun doToast(context: Context) {
        Toast.makeText(
            context,
            "This is Library One with ${CoreCode.getCoreTypes()}",
            Toast.LENGTH_SHORT
        ).show()
    }
}