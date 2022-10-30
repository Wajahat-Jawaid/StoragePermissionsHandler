package com.wajahat.storagepermissionshandler

import android.content.Context
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog

object DialogUtils {

    fun showAlertDialog(
        context: Context,
        @StringRes title: Int,
        @StringRes message: Int,
        @StringRes buttonText: Int,
        action: () -> Unit
    ) {
        val resources = context.resources
        AlertDialog.Builder(context)
            .setTitle(resources.getString(title))
            .setMessage(resources.getString(message))
            .setCancelable(false)
            .setPositiveButton(resources.getString(buttonText)) { dialog, which ->
                action.invoke()
                dialog.dismiss()
            }
            .show()
    }
}