package com.arafat1419.baselibrary

import android.content.Context
import com.arafat1419.libraryone.LibraryOneCode
import com.arafat1419.librarytwo.LibraryTwoCode

object BaseCode {
    fun libraryOneToast(context: Context) {
        LibraryOneCode.doToast(context)
    }

    fun libraryTwoToast(context: Context) {
        LibraryTwoCode.doToast(context)
    }
}