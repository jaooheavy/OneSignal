package com.example.pushonesignal

import android.app.Application
import com.onesignal.OneSignal

class ApplicationApp: Application() {
    override fun onCreate() {
        super.onCreate()

        //Init Onesignal
        OneSignal.startInit(this)
            .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
            .unsubscribeWhenNotificationsAreDisabled(true)
            .init()
    }
}