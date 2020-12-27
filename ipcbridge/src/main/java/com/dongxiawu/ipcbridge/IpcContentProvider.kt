package com.dongxiawu.ipcbridge

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.os.Bundle

class IpcContentProvider : ContentProvider() {

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        // empty
        return 0
    }

    override fun getType(uri: Uri): String? {
        // empty
        return null
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        // empty
        return null
    }

    override fun onCreate(): Boolean {
        // empty
        return false
    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? {
        // empty
        return null
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        // empty
        return 0
    }

    override fun call(method: String, arg: String?, extras: Bundle?): Bundle? {
        when (method) {
            METHOD_CALL -> {
                extras?.let {
                  val call: Call? = it.getParcelable(PARAM_CALL)
                    if (call != null) {

                    }
                }
            }
            else -> {}
        }
        return super.call(method, arg, extras)
    }

    private fun invoke(call: Call): Reply? {
        return ReplyHandlerFactory.getReplyHandler("").handle()
    }
}