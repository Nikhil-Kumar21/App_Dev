package com.iitr.memeshare

import android.content.Context

class Repository {
    private var api = ApiCall()
    fun getUrl(context: Context): String? {
        return api.requesting(context)

    }
}