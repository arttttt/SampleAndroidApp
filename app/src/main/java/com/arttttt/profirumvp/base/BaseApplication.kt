package com.arttttt.profirumvp.base

import android.app.Application
import com.vk.sdk.VKSdk

class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        VKSdk.initialize(this)
    }
}